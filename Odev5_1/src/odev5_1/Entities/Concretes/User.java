package odev5_1.Entities.Concretes;

import odev5_1.Entities.Abstracts.Entity;

public class User implements Entity{

    private String Name;
    private String Surname;
    private String Email;
    private String Password;

    public User() {
        System.out.println("Temel kullanıcı bilgileri zorunludur lütfen doldurunuz.");
        
    }

    public User(String Name, String Surname, String Email, String Password) {

        this.Name = Name;
        this.Surname = Surname;
        this.Email = Email;
        this.Password = Password;

    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
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

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

}
