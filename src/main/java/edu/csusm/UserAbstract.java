package edu.csusm;

import java.io.FileNotFoundException;

public abstract class UserAbstract {
    public void setIsUser(boolean u){}
    public boolean isUser(String userName, String userPasscode) throws FileNotFoundException{ return isUser(userName, userPasscode); }
    abstract public void setAccount(AccountAccessIF a);
}
