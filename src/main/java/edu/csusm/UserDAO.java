package edu.csusm;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class UserDAO {
    private static String name;
    private static String username;
    private static String passcode;
    public static UserDAO user = null;

    public UserDAO() {
        username = "";
        passcode = "";
        user = this;
    }

    public UserDAO(String u, String p) {
        username = u;
        passcode = p;
        user = this;
    }
    public static boolean createFile( String name, String pass, String question, String answer){
        String path = "/Users/carterrath/Documents/Spring2023/SE 471/SafeKey/dataFiles/";
        String fileName = path + name + ".txt";
        File file = new File(fileName);
        try {
            if(file.createNewFile()){
                FileWriter myWriter = new FileWriter(fileName);
                String ePass = KeyManager.getInstance().encryption(pass, 0, 1);
                myWriter.write(name + "," + ePass + "\n");
                String eAnswer = KeyManager.getInstance().encryption(answer, 0, 1);
                myWriter.write(question + "," + eAnswer + "\n");
                myWriter.close();
                return true;
            }else{
                System.out.println("file already exists");
                return false;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return false;
    }
    public static String[] parseFile(String userName){
        String path = "/Users/carterrath/Documents/Spring2023/SE 471/SafeKey/dataFiles/";
        String fileName = path + userName + ".txt";
        try {
            File f = new File(fileName);
            Scanner myReader = new Scanner(f);
            String data = myReader.nextLine();
            String delim1 = ",";
            String[] arr1 = data.split(delim1);
            arr1[1] = KeyManager.getInstance().encryption(arr1[1], 0, 2);
            data = myReader.nextLine();
            String[] arr2 = data.split(delim1);
            arr2[1] = KeyManager.getInstance().encryption(arr2[1], 0, 2);
            myReader.close();
            return append(arr1, arr2);
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }
    public static String[] append(String[] a1, String[] a2){
        String[] ret = new String[a1.length + a2.length];
        System.arraycopy(a1, 0, ret, 0, a1.length);
        System.arraycopy(a2, 0, ret, a1.length, a2.length);
        return ret;
    }
    public static void updateAccountPassword(String user, String newPass) throws Exception {
        String path = "/Users/carterrath/Documents/Spring2023/SE 471/SafeKey/dataFiles/";
        String fileName = path + user + ".txt";
        String ePass = KeyManager.getInstance().encryption(newPass, 0, 1);
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            List<String> lines = new ArrayList<String>();
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
            bufferedReader.close();
            String[] vals = lines.toArray(new String[lines.size()]);
            vals[0] = user + "," + ePass;
            FileWriter myWriter = new FileWriter(fileName);
            for(int i = 0; i < vals.length; i++) {
                myWriter.write(vals[i] + "\n");
            }
            myWriter.close();

        }
        catch(IOException e) {
            e.printStackTrace();
        }

    }
    public static String[] addSiteInfo(String siteName, String password, int method){
        try {
            String user = User.u.getUserName();
            String path = "/Users/carterrath/Documents/Spring2023/SE 471/SafeKey/dataFiles/";
            String fileName = path + user + ".txt";
            Writer output;
            output = new BufferedWriter(new FileWriter(fileName, true));
            String entry = siteName + "," + method + "," + password;
            String delim = ",";
            String[] arr = entry.split(delim);
            output.append(entry + "\n");
            output.close();
            return arr;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    // delete from table;
    public static String[] deleteSiteInfo(String siteName){
        try {
            String[] oldInfo = new String[3];
        String user = User.u.getUserName();
        String path = "/Users/carterrath/Documents/Spring2023/SE 471/SafeKey/dataFiles/";
        String fileName = path + user + ".txt";
        File inputFile = new File(fileName);
        File tempFile = new File("myTempFile.txt");

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
        String currentLine;

        while((currentLine = reader.readLine()) != null) {
            // trim newline when comparing with lineToRemove
            String trimmedLine = currentLine.trim();
            String delim = ",";
            String[] arr = trimmedLine.split(delim);
            if(arr[0].equals(siteName)){
                oldInfo = arr;
                continue;
            }
            writer.write(currentLine + "\n");
        }
        writer.close();
        reader.close();
        boolean successful = tempFile.renameTo(inputFile);
        return oldInfo;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String[] editSiteInfo(String name, String pass) throws Exception {
        int encryptMethod;
        String[] oldInfo = new String[3];
        String ePass;
        String user = User.u.getUserName();
        String path = "/Users/carterrath/Documents/Spring2023/SE 471/SafeKey/dataFiles/";
        //String path = "/SafeKey/dataFiles/";
        String fileName = path + user + ".txt";
        File inputFile = new File(fileName);
        File tempFile = new File("myTempFile.txt");

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
        String currentLine;
        while((currentLine = reader.readLine()) != null) {
            // trim newline when comparing with lineToRemove
            String trimmedLine = currentLine.trim();
            String delim = ",";
            String[] arr = trimmedLine.split(delim);
            if(arr[0].equals(name)){
                oldInfo = arr;
                encryptMethod = Integer.parseInt(arr[1]);
                ePass = KeyManager.getInstance().encryption(pass, encryptMethod, 1);
                currentLine = arr[0] + "," + arr[1] + "," + ePass;
            }
            writer.write(currentLine + "\n");
        }
        writer.close();
        reader.close();
        boolean successful = tempFile.renameTo(inputFile);
        return oldInfo;
    }

    public static ArrayList<String[]> viewAllSiteInfo() throws IOException {
        ArrayList<String[]> sites = new ArrayList<String[]>();
        String user = User.u.getUserName();
        String path = "/Users/carterrath/Documents/Spring2023/SE 471/SafeKey/dataFiles/";
        String fileName = path + user + ".txt";
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String currentLine;
        int i = 0;
        while((currentLine = reader.readLine()) != null){
            if(i > 1){
                String trimmedLine = currentLine.trim();
                String delim = ",";
                String[] arr = trimmedLine.split(delim);
                sites.add(arr);
            }
            i++;
        }
        return sites;
    }

    public void setName(String f, String l) {
        name = f+" "+l;
    }

    public String getName() {
        return name;
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
