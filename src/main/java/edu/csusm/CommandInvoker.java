package edu.csusm;

public class CommandInvoker {
    DeletePasswordCommand delete;
    AddPasswordCommand add;
    EditPasswordCommand edit;

    public void DeletePassword(KeyManager password, int c){
        if(c == 4){
            delete.undoIt();
        }
        else{
            delete.doIt();
        }
    }

    public void AddPassword(KeyManager password, int c) {
        if(c == 4){
            add.undoIt();
        }
        else{
            add.doIt();
        }
    }

    public void EditPassword(KeyManager password, int c) {
        if(c == 4){
            edit.undoIt();
        }
        else{
            edit.doIt();
        }
    }
}
