package edu.csusm;

import java.io.FileNotFoundException;

public class User{
    private boolean isUser;
    private String userName;
    private String password;
    public static User u;
    User(String user, String pass){
        this.userName = user;
        this.password = pass;
        u = this;
    }
    public void setUserName(String user){
        this.userName = user;
    }
    public String getUserName(){
        return this.userName;
    }
    public void setPassword(String pass){
        this.password = pass;
    }
    public String getPassword(){
        return this.password;
    }
    public void setIsUser(boolean u) {
        isUser = u;
    }

    public boolean isUser(String userName, String userPasscode) throws FileNotFoundException{
        this.userName = userName;
        this.password = password;
        String[] arr = UserDAO.parseFile(userName);//parse file first
        if(arr == null){
            return false;
        }
        String user = arr[0];
        String pass = arr[1];
        if (userPasscode.equals(pass) && userName.equals(user)) {
            isUser = true;
        }
        else {
            isUser = false;
        }
        return isUser;
    }
}
