package org.example;

public class LoginRequestPojo {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LoginRequestPojo(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginRequestPojo{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
