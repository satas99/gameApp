package gameApp.dataAccess.concretes.hibernateImpls;

import gameApp.dataAccess.abstracts.GameDao;
import gameApp.entities.concretes.Game;

public class GameHibernateDao implements GameDao{

	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " adlý oyun hibernate'e eklendi");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " adlý oyun hibernate'de güncellendi");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() + " adlý oyun hibernate'den silindi");
		
	}

}
