package gameApp.entities.concretes;


import gameApp.entities.abstracts.Entity;

public class Sale implements Entity {
	private int id;
	private Game game;
	private Gamer gamer;
	private Campaign campaign;
	public Sale() {
		super();
	}
	public Sale(int id) {
		super();
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public Gamer getGamer() {
		return gamer;
	}
	public void setGamer(Gamer gamer) {
		this.gamer = gamer;
	}
	public Campaign getCampaign() {
		return campaign;
	}
	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}
	
	
}
