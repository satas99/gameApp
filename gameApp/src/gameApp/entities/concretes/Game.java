package gameApp.entities.concretes;

import java.util.ArrayList;

import gameApp.entities.abstracts.Entity;

public class Game implements Entity {
	private int id;
	private String name;
	private double price;
	private ArrayList<Gamer> gamers;
	
	public Game() {
		super();
	}
	public Game(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public ArrayList<Gamer> getGamers() {
		return gamers;
	}
	public void setGamers(ArrayList<Gamer> gamers) {
		this.gamers = gamers;
	}
}
