package com.training.org;

class Player
{
	static String league ="IPL";
	String name;
	
	public Player(String name) 
	{
		this.name = name;
	}
}

public class StaticVariableExample 
{
	static
	{
		System.out.println("Static Bolck Calling");
	}
	
	public static void main(String[] args) 
	{
		Player p1 = new Player("Virat");
		Player p2 = new Player("Rohit");
		
		System.out.println(Player.league);
		System.out.println(Player.league);
	}
}
