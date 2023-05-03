package edu.csusm;

import java.util.ArrayList;
import java.util.LinkedList;

public class KeyManager {
    private static KeyManager password;
    LinkedList<Integer>commands = new LinkedList<Integer>();
    String input;
    ArrayList<String>inputs = new ArrayList<String>();
    public KeyManager() {

    }

    public static synchronized KeyManager getPassword() {
        return password;
    }

    public void setPassword(String pass){
        input = pass;
    }

    public void passwordCommand(int c){
        CommandInvoker command = new CommandInvoker();
        switch (c){
            case 1: 
                command.AddPassword(this, c); //command 1 is add
                commands.push(c);
            case 2: 
                command.DeletePassword(this, c); //command 2 is delete
                commands.push(c);
            case 3: 
                command.EditPassword(this, c); //command 3 is edit
                commands.push(c);
            case 4: // command 4 is to undo
                commands.pop();
            default: System.out.print("Command not recognized");
        }
    }

    public void encryption (String pass, int key) {
        //SecurePasswordIF secure;
        //call encrypt
        //call decrypt
    }
}
