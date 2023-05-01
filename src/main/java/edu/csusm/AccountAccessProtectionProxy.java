package edu.csusm;

import java.io.FileNotFoundException;

public class AccountAccessProtectionProxy implements AccountAccessIF {
    private AccountAccess acct = new AccountAccess();
    @Override
    public boolean accessHomePage(User u, String un, String p) throws FileNotFoundException {
        if(u.isUser(un, p)){
            return acct.accessHomePage(u, un, p);
        }
        else {
            return false;
        }
    }
}
