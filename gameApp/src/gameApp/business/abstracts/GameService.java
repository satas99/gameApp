package gameApp.business.abstracts;

import gameApp.entities.concretes.Game;

public interface GameService {
	void add(Game game);
	void update(Game game);
	void delete(Game game);
}
