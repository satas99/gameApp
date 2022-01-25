package gameApp;

import java.time.LocalDate;

import gameApp.business.concretes.CampaignManager;
import gameApp.business.concretes.GameManager;
import gameApp.business.concretes.GamerManager;
import gameApp.business.concretes.SaleManager;
import gameApp.core.mernis.concretes.MernisManager;
import gameApp.dataAccess.concretes.hibernateImpls.GameHibernateDao;
import gameApp.dataAccess.concretes.hibernateImpls.GamerHibernateDao;
import gameApp.dataAccess.concretes.hibernateImpls.SaleHibernateDao;
import gameApp.dataAccess.concretes.jdbcImpls.CampaignJdbcDao;
import gameApp.entities.concretes.Campaign;
import gameApp.entities.concretes.Game;
import gameApp.entities.concretes.Gamer;
import gameApp.entities.concretes.Sale;

public class Main {

	public static void main(String[] args) {
		GamerManager gamerManager = new GamerManager(new GamerHibernateDao(), new MernisManager());
		
		Gamer gamer1 = new Gamer(1,"1111111111","serhat","ataþ", LocalDate.of(2000, 2, 11));
		gamerManager.add(gamer1);
		gamerManager.add(new Gamer(2,"222222222","yunus ","yýlmaz", LocalDate.of(1980, 5,16)));
		gamerManager.add(new Gamer(3,"333333333","ömer","demir", LocalDate.of(1999, 3, 8)));
		
		GameManager gameManager = new GameManager(new GameHibernateDao());
		Game game1=new Game(1, "League of Legends", 1200);
		gameManager.add(game1);
		gameManager.add(new Game(2, "Valorant", 200));
		gameManager.add(new Game(3, "CS GO", 2200));
		
		CampaignManager campaignManager = new CampaignManager(new CampaignJdbcDao());
		Campaign campaign = new Campaign(1, "Black Friday", LocalDate.of(2021, 02, 01), LocalDate.of(2021, 03, 01), 20.0 );
		campaignManager.add(campaign);
		
		SaleManager saleManager = new SaleManager(new SaleHibernateDao(), gameManager,gamerManager);
		Sale sale=new Sale(8);
		sale.setCampaign(campaign);
		sale.setGame(game1);
		sale.setGamer(gamer1);
		saleManager.add(sale);
		saleManager.delete(sale);
		
	}

}
