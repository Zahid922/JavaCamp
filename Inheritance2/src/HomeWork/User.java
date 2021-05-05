package HomeWork;

public class User {
    
    private String UserName;
    private String Password;

    public User(String UserName, String Password) {
        this.UserName = UserName;
        this.Password = Password;
    }

    public User() {
        
    }

    public String getUserName() {
        return UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
        
}
