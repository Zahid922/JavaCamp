package Entities.concretes;

import Entities.abstracts.Entity;

public class User implements Entity{

    private int Id;
    private String Email;
    private String Password;
    private String Name;
    private String Surname;
        
    
    public User() {
        
    }

    public User(int Id, String Email, String Password, String Name, String Surname) {
        this.Id = Id;
        this.Email = Email;
        this.Password = Password;
        this.Name = Name;
        this.Surname = Surname;

    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

}
