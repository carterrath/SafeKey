package edu.csusm;

import java.io.FileNotFoundException;

public class AccountAccess implements AccountAccessIF {
    @Override
    public boolean accessHomePage(User u, String un, String p) throws FileNotFoundException {
        new HomeScreen(u); // go into account homepage
        return true;
    }
}
