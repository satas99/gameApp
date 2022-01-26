package gameApp.dataAccess.concretes.hibernateImpls;

import gameApp.dataAccess.abstracts.GamerDao;
import gameApp.entities.concretes.Gamer;

public class GamerHibernateDao implements GamerDao {

	@Override
	public void add(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " adl� oyuncu hibernate'e eklendi");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " adl� oyuncu hibernate'de g�ncellendi");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " adl� oyuncu hibernate'den silindi");
		
	}

}
