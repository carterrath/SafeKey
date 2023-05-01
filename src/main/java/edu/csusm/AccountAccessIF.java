package edu.csusm;

import java.io.FileNotFoundException;

public interface AccountAccessIF {
    public boolean accessHomePage(User u, String un, String p)throws FileNotFoundException;
}
