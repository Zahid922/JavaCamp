/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concrete;

import Abstracts.GamerService;
import Entities.Gamer;

/**
 *
 * @author ZAHİD
 */
public class GamerManager implements GamerService{

    @Override
    public void add(Gamer gamer) {
        System.out.println("Oyuncu eklendi : " + gamer.getUserName());
    }

    
    public void delete(Gamer gamer) {
        System.out.println("Oyuncu silindi : " + gamer.getUserName());
    }
}
