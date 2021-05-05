package Entities;

import Abstracts.Entity;
import Abstracts.GamerService;

public class Gamer {

    private int Id;
    private String UserName;
    private String email;

    public Gamer() {

    }

    public Gamer(int Id, String UserName, String email) {
        this.Id = Id;
        this.UserName = UserName;
        this.email = email;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}
