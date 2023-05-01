package edu.csusm;

import java.util.ArrayList;

public class KeyManager {
    private KeyManager password;
    ArrayList<String>inputs = new ArrayList<String>();
    public KeyManager() {

    }

    public static synchronized KeyManager getPassword() {
        return null;
    }

    public void passwordCommand(int c){
        // command 4 is to undo
        CommandInvoker command = new CommandInvoker();
        //command 1 is delete
        command.AddPassword(password, c);
        //command 2 is add
        command.DeletePassword(password, c);
        //command 3 is edit
        command.EditPassword(password, c);
    }

    public void encryption (String pass, int key) {
        //SecurePasswordIF secure;
        //call encrypt
        //call decrypt
    }
}
