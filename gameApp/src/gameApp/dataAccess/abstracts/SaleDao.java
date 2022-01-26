package gameApp.dataAccess.abstracts;

import gameApp.entities.concretes.Sale;

public interface SaleDao {
	void add(Sale sale);
	void delete(Sale sale);
}
