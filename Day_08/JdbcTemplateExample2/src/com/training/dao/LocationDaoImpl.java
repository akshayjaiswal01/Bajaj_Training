package com.training.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.training.entity.State;

public class LocationDaoImpl implements LocationDao {

	private JdbcTemplate jdbcTemplate;

	@Override
	public void setDataSource(DataSource ds) {

		this.jdbcTemplate = new JdbcTemplate(ds);

	}

	@Override
	public void insertState(String name) {
		String sql = "INSERT INTO state (name) VALUES (?)";
		jdbcTemplate.update(sql, name);

	}

	@Override
	public void insertCity(String name, int stateId) {
		String sql = "INSERT INTO city (name, state_id) values (?, ?)";
		jdbcTemplate.update(sql, name, stateId);

	}

	@Override
	public List<State> getStateWithCities() {

		String sql = "SELECT s.id AS state_id, s.name AS state_name, c.name AS city_name "
				+ "FROM state s LEFT JOIN city c ON s.id = c.state_id";

		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);

		Map<Integer, State> map = new HashMap<>();

		for (Map<String, Object> row : rows) {

			int stateId = (int) row.get("state_id");

			// check if state already exists
			if (!map.containsKey(stateId)) {
				State s = new State();
				s.setId(stateId);
				s.setName((String) row.get("state_name"));
				map.put(stateId, s);
			}

			// add city
			String city = (String) row.get("city_name");
			if (city != null) {
				map.get(stateId).getCities().add(city);
			}
		}

		return new ArrayList<>(map.values());
	}

}
