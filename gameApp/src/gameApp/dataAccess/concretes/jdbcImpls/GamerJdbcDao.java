package gameApp.dataAccess.concretes.jdbcImpls;

import gameApp.dataAccess.abstracts.GamerDao;
import gameApp.entities.concretes.Gamer;

public class GamerJdbcDao implements GamerDao {

	@Override
	public void add(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " adlý oyuncu jdbc'ye eklendi");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " adlý oyuncu jdbc'de güncellendi");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " adlý oyuncu jdbc'den silindi");
		
	}

}
