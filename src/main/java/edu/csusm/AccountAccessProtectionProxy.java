package edu.csusm;

import java.io.FileNotFoundException;

public class AccountAccessProtectionProxy implements AccountAccessIF {
    private AccountAccess acct;
    @Override
    public boolean accessHomePage(User u, String un, String p) throws FileNotFoundException {
        acct = new AccountAccess();
        if(u.isUser(un, p)){

            return acct.accessHomePage(u, un, p);
        }
        else {
            return false;
        }
    }

}
