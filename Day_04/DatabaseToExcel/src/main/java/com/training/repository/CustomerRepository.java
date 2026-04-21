package com.training.repository;

import java.sql.*;
import java.util.ArrayList;

import com.training.entity.Billbook;
import com.training.entity.Customer;
import com.training.util.JDBCUtil;

public class CustomerRepository {

    // ADD CUSTOMER + BILL
    public void addCustomer(Customer c) {
        try (Connection con = JDBCUtil.getConnection()) {

            // Insert Bill first
            String billSql = "INSERT INTO billbook VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps1 = con.prepareStatement(billSql);
            ps1.setInt(1, c.getBill().getBillId());
            ps1.setString(2, c.getBill().getBillDate());
            ps1.setString(3, c.getBill().getProduct());
            ps1.setInt(4, c.getBill().getQuantity());
            ps1.setDouble(5, c.getBill().getTotalAmount());
            ps1.executeUpdate();

            // Insert Customer
            String custSql = "INSERT INTO customer VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps2 = con.prepareStatement(custSql);
            ps2.setInt(1, c.getCustId());
            ps2.setString(2, c.getCustName());
            ps2.setString(3, c.getCustAddress());
            ps2.setString(4, c.getCustMob());
            ps2.setInt(5, c.getBill().getBillId());
            ps2.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // DISPLAY ALL
    public ArrayList<Customer> getAllCustomers() {
        ArrayList<Customer> list = new ArrayList<>();

        try (Connection con = JDBCUtil.getConnection()) {

            String sql = "SELECT * FROM customer c JOIN billbook b ON c.bill_id = b.bill_id";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Billbook bill = new Billbook(
                        rs.getInt("bill_id"),
                        rs.getString("bill_date"),
                        rs.getString("product"),
                        rs.getInt("quantity"),
                        rs.getDouble("total_amount")
                );

                Customer cust = new Customer(
                        rs.getInt("cust_id"),
                        rs.getString("cust_name"),
                        rs.getString("cust_address"),
                        rs.getString("cust_mob"),
                        bill
                );

                list.add(cust);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    // FIND CUSTOMER
    public Customer findCustomer(int id) {
        Customer cust = null;

        try (Connection con = JDBCUtil.getConnection()) {

            String sql = "SELECT * FROM customer c JOIN billbook b ON c.bill_id = b.bill_id WHERE c.cust_id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Billbook bill = new Billbook(
                        rs.getInt("bill_id"),
                        rs.getString("bill_date"),
                        rs.getString("product"),
                        rs.getInt("quantity"),
                        rs.getDouble("total_amount")
                );

                cust = new Customer(
                        rs.getInt("cust_id"),
                        rs.getString("cust_name"),
                        rs.getString("cust_address"),
                        rs.getString("cust_mob"),
                        bill
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return cust;
    }
}