package edu.csusm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Recovery {
    User user;
    String question1 = "";
    String answer1 = "";
    String question2 = "";
    String answer2 = "";
    String q1Info = "";
    String q2Info = "";
    boolean correct = false;
    String recovery = "C:\\Users\\ruthi\\OneDrive\\Documents\\SE 471\\Project\\SafeKeyProject\\SafeKey\\src\\main\\java\\edu\\csusm\\recovery.txt";

    static String[] tokens = new String[4];
    static String[] tokens2 = new String[4];
    static String[] tokens3 = new String[4];

    //constructor
    public Recovery(User u){
        user = u;
    }

    public void setUpRecovery(String q1, String a1, String q2, String a2) {
        // recovery questions and answers
        question1 = q1;
        answer1 = a1;
        question2 = q2;
        answer2 = a2;

        // saves questions
        PrintWriter setRecovery;
        try {
            setRecovery = new PrintWriter(new File(recovery));
            setRecovery.println(question1 + "\n" + answer1 + "\n" + question2 + "\n" + answer2);
            setRecovery.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String getQuestion1() {
        Scanner getQuestion1;
        try {
            getQuestion1 = new Scanner(new File(recovery));
            while (getQuestion1.hasNextLine()) {
                for(int i = 0; i < 4; i++) {
                    String q1Info = getQuestion1.nextLine();
                    tokens2[i] = q1Info;
                }
            }
            getQuestion1.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        question1 = tokens2[0];
        return question1;
    }

    public String getQuestion2() {
        Scanner getQuestion2;
        try {
            getQuestion2 = new Scanner(
                    new File(recovery));
            while (getQuestion2.hasNextLine()) {
                for(int i = 0; i < 4; i++) {
                    String q2Info = getQuestion2.nextLine();
                    tokens3[i] = q2Info;
                }
            }
            getQuestion2.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        question2 = tokens3[2];
        return question2;
    }

    public boolean checkRecovery(String enteredAnswer1, String enteredAnswer2) {
        Scanner getRecovery;
        try {
            getRecovery = new Scanner(new File(recovery));
            //parse Recovery

            while (getRecovery.hasNextLine()) {
                String recoverInfo = getRecovery.nextLine();
                if (recoverInfo.equals(enteredAnswer1)){
                    getRecovery.nextLine();
                    String recoverInfo2 = getRecovery.nextLine();
                    if (recoverInfo2.equals(enteredAnswer2)){
                        correct = true;
                    }
                }
                else correct = false;
            }
            getRecovery.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return correct;
    }

    public void changeAccountPasscode(String newPass) throws FileNotFoundException {
        User.newInfo = User.tokens[0] + " " + User.tokens[1] + " " + User.tokens[2] + " " + User.tokens[3] + " " + User.tokens[4] + " " + newPass;
        user.writeFile(User.newInfo);
    }
}
