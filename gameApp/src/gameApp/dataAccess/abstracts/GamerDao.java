package gameApp.dataAccess.abstracts;

import gameApp.entities.concretes.Gamer;

public interface GamerDao {
	void add(Gamer gamer);
	void update(Gamer gamer);
	void delete(Gamer gamer);
}
