package gameApp.entities.concretes;

import java.time.LocalDate;
import java.util.ArrayList;

import gameApp.entities.abstracts.Entity;

public class Gamer implements Entity {
	private int id;
	private String identityNumber;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private ArrayList<Game> games;
	
	public Gamer() {
		super();
	}
	public Gamer(int id, String identityNumber, String firstName, String lastName, LocalDate dateOfBirth) {
		super();
		this.id = id;
		this.identityNumber = identityNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIdentityNumber() {
		return identityNumber;
	}
	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public ArrayList<Game> getGames() {
		return games;
	}
	public void setGames(ArrayList<Game> games) {
		this.games = games;
	}
	
}
