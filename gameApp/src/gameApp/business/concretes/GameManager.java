package gameApp.business.concretes;

import java.util.ArrayList;

import gameApp.business.abstracts.GameService;
import gameApp.dataAccess.abstracts.GameDao;
import gameApp.entities.concretes.Game;


public class GameManager implements GameService {
	private GameDao gameDao;
	ArrayList<Game> games = new ArrayList<Game>();
	
	
	public GameManager(GameDao gameDao) {
		super();
		this.gameDao = gameDao;
	}
	@Override
	public void add(Game game) {
		this.gameDao.add(game);
		this.games.add(game);
	
	}
	@Override
	public void update(Game game) {
		this.gameDao.update(game);
		
	}

	@Override
	public void delete(Game game) {
		this.gameDao.delete(game);
		
	}
	public ArrayList<Game> getGames() {
		return games;
	}

}
