package gameApp.business.abstracts;

import gameApp.entities.concretes.Gamer;

public interface GamerService {
	void add(Gamer gamer);
	void update(Gamer gamer);
	void delete(int id);
}
