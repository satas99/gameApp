package gameApp.dataAccess.concretes.jdbcImpls;

import gameApp.dataAccess.abstracts.GameDao;
import gameApp.entities.concretes.Game;

public class GameJdbcDao implements GameDao {

	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " adl� oyun jdbc'ye eklendi");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " adl� oyun jdbc'de g�ncellendi");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() + " adl� oyun jdbc'den silindi");
		
	}

}
