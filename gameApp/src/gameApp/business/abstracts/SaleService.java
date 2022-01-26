package gameApp.business.abstracts;

import gameApp.entities.concretes.Sale;

public interface SaleService {
	void add(Sale sale);
	void delete(Sale sale);
}
