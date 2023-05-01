package edu.csusm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class User extends UserAbstract{
    String path = "C:\\Users\\ruthi\\OneDrive\\Documents\\SE 471\\Project\\SafeKeyProject\\SafeKey\\src\\main\\java\\edu\\csusm\\usersFile.txt";
    static boolean isUser = false;
    static String[] tokens = new String[6];
    static String newInfo = "";
    UserDAO user;
    Scanner usersFileReader;
    AccountIF account;

    public void setIsUser(boolean u) {
        isUser = u;
    }

    public boolean isUser(String userName, String userPasscode) throws FileNotFoundException{
        parseFile();//parse file first

        if (userPasscode.equals(user.getPasscode()) && userName.equals(user.getUsername())) {
            setIsUser(true);
        } else {
            setIsUser(false);
        }

        usersFileReader.close();
        return isUser;
    }

    public void setAccount(AccountIF a) {
        account = a;
    }

    public void parseFile() throws FileNotFoundException{

        usersFileReader = new Scanner(new File(path));

        while (usersFileReader.hasNextLine()){
            String info = usersFileReader.nextLine();
            String delims = "[ ]+";
            tokens = info.split(delims);

            user = new UserDAO(tokens[0], tokens[1], tokens[2], tokens[3],
                    tokens[4], tokens[5]);
        }
        usersFileReader.close();
    }

    public void writeFile(String userInfo) throws FileNotFoundException{
        // add to file
        PrintWriter usersFileWriter = new PrintWriter(new File(path));
        usersFileWriter.println(userInfo);
        usersFileWriter.close();
    }

}
