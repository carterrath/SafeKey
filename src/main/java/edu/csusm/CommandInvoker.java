package edu.csusm;

public class CommandInvoker {

    private DeletePasswordCommand delete;
    private AddPasswordCommand add;
    private EditPasswordCommand edit;
    private Stack undoStack;
    private Stack redoStack;
    CommandInvoker(){
        undoStack = new Stack();
        redoStack = new Stack();
    }

    public void DeletePassword(String name, int c) throws Exception {
            if(c == 1){
                delete = new DeletePasswordCommand(name);
                delete.doIt();
                undoStack.push(delete);
        }
            else if(c == 2){
            if(!undoStack.isEmpty()) {
                AbstractPasswordCommand popped = undoStack.pop();
                popped.undoIt();
                redoStack.push(popped);
            }
        }
            else if(c == 3){
            if(!redoStack.isEmpty()) {
                AbstractPasswordCommand popped = redoStack.pop();
                undoStack.push(popped);
                popped.redoIt();
            }
        }
    }

    public void AddPassword(String site, String pass, int c, int method) throws Exception {
        if(c == 1){
            add = new AddPasswordCommand(site, pass, method);
            add.doIt();
            undoStack.push(add);
        }
        else if(c == 2){
            if(!undoStack.isEmpty()) {
                AbstractPasswordCommand popped = undoStack.pop();
                popped.undoIt();
                redoStack.push(popped);
            }
        }
        else if(c == 3){
            if(!redoStack.isEmpty()) {
                AbstractPasswordCommand popped = redoStack.pop();
                undoStack.push(popped);
                popped.redoIt();
            }
        }
    }

    public void EditPassword(String siteName, String newPass, int c) throws Exception {
        if(c == 1){
            edit = new EditPasswordCommand(siteName, newPass);
            edit.doIt();
            undoStack.push(edit);
        }
        else if(c == 2){
            if(!undoStack.isEmpty()) {
                AbstractPasswordCommand popped = undoStack.pop();
                popped.undoIt();
                redoStack.push(popped);
            }
        }
        else if(c == 3){
            if(!redoStack.isEmpty()) {
                AbstractPasswordCommand popped = redoStack.pop();
                undoStack.push(popped);
                popped.redoIt();
            }
        }
    }
}
