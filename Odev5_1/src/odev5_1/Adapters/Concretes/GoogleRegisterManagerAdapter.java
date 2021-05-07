package odev5_1.Adapters.Concretes;

import odev5_1.Adapters.Abstracts.GoogleRegisterService;
import odev5_1.GoogleRegister.GoogleRegisterManager;

public class GoogleRegisterManagerAdapter implements GoogleRegisterService{
    
    public void GRegister(){
        GoogleRegisterManager googleRegisterManager = new GoogleRegisterManager();
        googleRegisterManager.Register();
    }
    
}
