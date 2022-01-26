package gameApp.dataAccess.concretes.jdbcImpls;

import gameApp.dataAccess.abstracts.SaleDao;
import gameApp.entities.concretes.Sale;

public class SaleJdbcDao implements SaleDao {

	@Override
	public void add(Sale sale) {
		System.out.println(sale.getId() +" Sat��� jdbc'ye eklendi");
		
	}
	@Override
	public void delete(Sale sale) {
		System.out.println(sale.getId() +" Sat��� jdbc'de iptal edildi");
		
	}

}
