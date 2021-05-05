package Concrete;

import Entities.Gamer;
import Abstracts.GamerCheckService;

public class GamerCheckManager implements GamerCheckService{

    public boolean GamerIfRealPerson(Gamer gamer) {
       
        
        return true;
    }

}
