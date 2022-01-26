package gameApp.business.concretes;

import java.util.ArrayList;

import gameApp.business.abstracts.GamerService;
import gameApp.core.mernis.abstracts.MernisService;
import gameApp.dataAccess.abstracts.GamerDao;
import gameApp.entities.concretes.Gamer;


public class GamerManager implements GamerService {
	ArrayList<Gamer> gamers= new ArrayList<Gamer>();
	private GamerDao gamerDao;
	private MernisService mernisService;
	
	public GamerManager(GamerDao gamerDao, MernisService mernisService) {
		super();
		this.gamerDao = gamerDao;
		this.mernisService = mernisService;
		
	}
	@Override
	public void add(Gamer gamer) {
		boolean control= this.mernisService.identityNumberVerification(gamer.getIdentityNumber(), gamer.getFirstName(), gamer.getLastName(), gamer.getDateOfBirth());
		if(control) {
			System.out.println("Doðrulama gerçekleþtirildi");
			for (Gamer gamer2 : this.gamers) {
				if (gamer2.getId()==gamer.getId()) {
					System.out.println("Kullanýcý sistemde kayýtlý");
					return;
				}
			}
			this.gamerDao.add(gamer);
			this.gamers.add(gamer);
		}else {
			System.out.println("Doðrulama gerçekleþtirilemedi");
		}
	}

	@Override
	public void update(Gamer updateGamer) {
		
		for (Gamer gamer : this.gamers) {
			if (gamer.getId()==updateGamer.getId()) {
				gamer=updateGamer;
			}
		}
		this.gamerDao.update(updateGamer);

	}

	@Override
	public void delete(int id) {
		Gamer delete=null;
		for (Gamer gamer : this.gamers) {
			if (gamer.getId()==id) {
				delete=gamer;
			}
		}
		this.gamers.remove(delete);
		this.gamerDao.delete(delete);
		
	}
	public ArrayList<Gamer> getGamers() {
		return gamers;
	}

}
