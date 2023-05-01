package edu.csusm;

public class UserDAO {
    private static String name;
    private static String email;
    private static String DOB;
    private static String username;
    private static String passcode;

    public UserDAO() {
        name = "";
        email = "";
        DOB = "";
        username = "";
    }

    public UserDAO(String f, String l, String e, String dob, String u, String p) {
        name = f+" "+l;
        email = e;
        DOB = dob;
        username = u;
        passcode = p;
    }

    public void setName(String f, String l) {
        name = f+" "+l;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String e) {
        email = e;
    }

    public String getEmail() {
        return email;
    }

    public void setDOB(String dob) {
        DOB = dob;
    }

    public String getDOB() {
        return DOB;
    }

    public void setUsername(String u) {
        username = u;
    }

    public String getUsername() {
        return username;
    }

    public void setPasscode(String p) {
        passcode = p;
    }

    public String getPasscode() {
        return passcode;
    }
}
