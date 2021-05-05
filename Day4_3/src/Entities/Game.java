package Entities;

import Abstracts.Entity;

public class Game implements Entity {

    private int id;
    private String gameName;
    private double price;
    private String storageSpace;

    public Game() {

    }

    public Game(int id, String gameName, double price, String storageSpace) {
        this.id = id;
        this.gameName = gameName;
        this.price = price;
        this.storageSpace = storageSpace;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStorageSpace() {
        return storageSpace;
    }

    public void setStorageSpace(String storageSpace) {
        this.storageSpace = storageSpace;
    }

}
