package Main;

import Concrete.CampaignManager;
import Concrete.GameManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {
    
    public static void main(String[] args) {
        Gamer gamer = new Gamer(1 ,"Zahid" ,"Zahid@mail.com");
        Game game = new Game(1 , "CsGo" , 100 ,"15 GB");
        GameManager gameManager = new GameManager();
        gameManager.Sell(gamer);
        Campaign campaign = new Campaign(1 , 15);
        System.out.println(campaign.getPriceAfterDiscount(game));
        CampaignManager campaignManager = new CampaignManager();
        campaignManager.addCampaign(game);
    }
    
}
