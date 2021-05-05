package Entities;

public class Campaign {

    private int id;
    private double discount;
    private double priceAfterDiscount;

    public Campaign() {
    
    }

    public Campaign(int id, double discount) {
        this.id = id;
        this.discount = discount;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getPriceAfterDiscount(Game game) {
        priceAfterDiscount = (game.getPrice() - (game.getPrice() * discount)/100);
        return priceAfterDiscount;
    }


}
