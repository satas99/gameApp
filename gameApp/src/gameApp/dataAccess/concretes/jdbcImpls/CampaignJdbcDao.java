package gameApp.dataAccess.concretes.jdbcImpls;

import gameApp.dataAccess.abstracts.CampaignDao;
import gameApp.entities.concretes.Campaign;

public class CampaignJdbcDao implements CampaignDao {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " adlý kampanya jdbc'ye eklendi");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " adlý kampanya jdbc'de güncellendi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " adlý kampanya jdbc'den silindi");
		
	}

}
