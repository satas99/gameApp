package gameApp.business.concretes;

import gameApp.business.abstracts.CampaignService;
import gameApp.dataAccess.abstracts.CampaignDao;
import gameApp.entities.concretes.Campaign;

public class CampaignManager implements CampaignService {
	private CampaignDao campaignDao;
	
	public CampaignManager(CampaignDao campaignDao) {
		super();
		this.campaignDao = campaignDao;
	}

	@Override
	public void add(Campaign campaign) {
		campaign.setAmountOfPercent(campaign.getAmountOfPercent()/100);
		this.campaignDao.add(campaign);
		
	}

	@Override
	public void update(Campaign campaign) {
		campaign.setAmountOfPercent(campaign.getAmountOfPercent()/100);
		this.campaignDao.update(campaign);
		
	}

	@Override
	public void delete(Campaign campaign) {
		this.campaignDao.delete(campaign);
		
	}
	
}
