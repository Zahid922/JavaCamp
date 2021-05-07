package odev5_1.Core.Concretes;

import odev5_1.Core.Abstracts.LoggerService;

public class LoggerManager implements LoggerService{
    
    @Override
    public void Logger(String Email){
        System.out.println(Email + " E posta adresini doğrulamak için linke tıklayınız.");
        
    }
    
}
