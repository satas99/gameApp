package gameApp.dataAccess.concretes.hibernateImpls;

import gameApp.dataAccess.abstracts.SaleDao;
import gameApp.entities.concretes.Sale;

public class SaleHibernateDao implements SaleDao {

	@Override
	public void add(Sale sale) {
		System.out.println(sale.getId() +" Sat��� hibernate'e eklendi");
		
	}
	@Override
	public void delete(Sale sale) {
		System.out.println(sale.getId() +" Sat��� hibernate'de iptal edildi");
		
	}

}
