package Concrete;

import Abstracts.GameService;
import Entities.Gamer;

public class GameManager implements GameService{

    @Override
    public void Sell(Gamer gamer) {
        System.out.println("Oyun, " + gamer.getUserName() +  " adlı oyuncuya satıldı.");
        
    }

    @Override
    public void Return(Gamer gamer) {
        System.out.println("Oyun, " + gamer.getUserName() +  " adlı oyuncudan iade alındı.");
   
    }

}
