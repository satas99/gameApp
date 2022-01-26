package gameApp.business.concretes;

import gameApp.business.abstracts.SaleService;
import gameApp.dataAccess.abstracts.SaleDao;
import gameApp.entities.concretes.Game;
import gameApp.entities.concretes.Gamer;
import gameApp.entities.concretes.Sale;

public class SaleManager implements SaleService {
	private SaleDao saleDao;
	private GameManager game;
	private GamerManager gamer;

	public SaleManager() {
		super();
	}

	public SaleManager(SaleDao saleDao, GameManager game, GamerManager gamer) {
		super();
		this.saleDao = saleDao;
		this.game = game;
		this.gamer = gamer;
	}

	@Override
	public void add(Sale sale) {

		for (Game game : this.game.games) {
			for (Gamer gamer : this.gamer.gamers) {
				if (gamer.getId() == sale.getGamer().getId() && game.getId() == sale.getGame().getId()) {
					if (sale.getCampaign() != null) {
						game.setPrice(game.getPrice() - (game.getPrice() * sale.getCampaign().getAmountOfPercent()));
						System.out.println(gamer.getFirstName() + " adlý oyuncuya " + game.getName() + " adlý oyun "
								+ game.getPrice() + " TL'ye indirimli fýyatýyla satýldý");
					} else {
						System.out.println(gamer.getFirstName() + " adlý oyuncuya " + game.getName() + " adlý oyun "
								+ game.getPrice() + " TL'ye satýldý");
					}
					this.saleDao.add(sale);
				}
			}
		}
	}

	@Override
	public void delete(Sale sale) {
		this.saleDao.delete(sale);

	}

}
