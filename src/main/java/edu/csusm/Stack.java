package edu.csusm;

import java.util.*;

public class Stack {
    private ArrayList<AbstractPasswordCommand> stack;
    private int top;

    public Stack(){
        stack = new ArrayList<AbstractPasswordCommand>();
        this.top = -1;
    }
    public int getTop(){
        return top;
    }
    public void push(AbstractPasswordCommand command){
        stack.add(command);
        top++;
    }
    public AbstractPasswordCommand pop(){
        if(this.top == -1){
            System.out.println("Stack is empty");
            return null;
        }
        AbstractPasswordCommand command = stack.get(top);
        stack.remove(top);
        top--;
        return command;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public void clearStack(){
        while(this.pop() != null){
        }
    }
}
