package gameApp.entities.concretes;

import java.time.LocalDate;

import gameApp.entities.abstracts.Entity;

public class Campaign implements Entity {
	private int id;
	private String name;
	private LocalDate startingCampaign;
	private LocalDate finishingCampaign;
	private double amountOfPercent;
	public Campaign() {
		super();
	}
	public Campaign(int id, String name, LocalDate startingCampaign, LocalDate finishingCampaign,
			double amountOfPercent) {
		super();
		this.id = id;
		this.name = name;
		this.startingCampaign = startingCampaign;
		this.finishingCampaign = finishingCampaign;
		this.amountOfPercent = amountOfPercent;
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
	public LocalDate getStartingCampaign() {
		return startingCampaign;
	}
	public void setStartingCampaign(LocalDate startingCampaign) {
		this.startingCampaign = startingCampaign;
	}
	public LocalDate getFinishingCampaign() {
		return finishingCampaign;
	}
	public void setFinishingCampaign(LocalDate finishingCampaign) {
		this.finishingCampaign = finishingCampaign;
	}
	public double getAmountOfPercent() {
		return amountOfPercent;
	}
	public void setAmountOfPercent(double amountOfPercent) {
		this.amountOfPercent = amountOfPercent;
	}
	
}
