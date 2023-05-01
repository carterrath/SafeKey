package edu.csusm;

import java.io.FileNotFoundException;

public class AccountAccess implements AccountAccessIF {
    @Override
    public boolean accessHomePage(User u, String un, String p) throws FileNotFoundException {
        HomePage home = new HomePage(u); // go into account homepage
        return true;
    }
}
