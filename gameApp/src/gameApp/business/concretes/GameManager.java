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
		for (Game game1 : games) {
			if(game1.getId()==game.getId()) {
				System.out.println("Oyun mevcut");
				return;
			}
		}
		this.gameDao.add(game);
		this.games.add(game);
	
	}
	@Override
	public void update(Game updateGame) {
		for (Game game1 : this.games) {
			if (game1.getId()==updateGame.getId()) {
				game1=updateGame;
			}
		}
		this.gameDao.update(updateGame);
		
	}

	@Override
	public void delete(int id) {
		Game deletedGame = null;
		for (Game game1 : this.games) {
			if (game1.getId()==id) {
				deletedGame=game1;
			}
		}
		games.remove(deletedGame);
		this.gameDao.delete(deletedGame);
		
	}
	public ArrayList<Game> getGames() {
		return games;
	}

}
