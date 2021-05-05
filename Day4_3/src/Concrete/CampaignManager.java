package Concrete;

import Abstracts.CampaignService;
import Entities.Game;

public class CampaignManager implements CampaignService {

    @Override
    public void addCampaign(Game game) {
        System.out.println("Kampanya, " + game.getGameName() + " adlı oyuna uygulandı");
    }

    @Override
    public void deleteCampaign(Game game) {
        System.out.println("Kampanya, " + game.getGameName() + " adlı oyundan kaldırıldı.");
    }

    @Override
    public void updateCampaign(Game game) {
        System.out.println(game.getGameName() + " adlı oyunun kampanyası güncellendi.");
    }

}
