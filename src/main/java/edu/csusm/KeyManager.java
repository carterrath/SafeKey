package edu.csusm;

public class KeyManager {
    private static KeyManager km = null;
    private final CommandInvoker ci;
    private KeyManager() {
        ci = new CommandInvoker();
    }
    public static KeyManager getInstance() {
        if (km == null) {
            km = new KeyManager();
        }
        return km;
    }
    public void addCommand(int encryptType, String site, String pass, int action) throws Exception {
        String ePass = encryption(pass,encryptType, 1);
        ci.AddPassword(site, ePass, action, encryptType);
    }
    public void deleteCommand(String site, int action) throws Exception {
        ci.DeletePassword(site, action);
    }
    public void editCommand(String site, String pass, int action) throws Exception {
        ci.EditPassword(site, pass, action);
    }
    public String encryption (String pass, int method, int command) throws Exception {
        SecurePasswordIF secure;
        //call encrypt (command 1)
        //call decrypt (command 2)
        // method 0 is AES
        if(method == 0){
            secure = new EncryptionAES();
            if(command == 1){
                return secure.encrypt(pass);
            }
            else if(command == 2){
                return secure.decrypt(pass);
            }
        }
        // method 1 is Blowfish
        else if(method == 1){
            secure = new EncryptionBlowfish();
            if(command == 1){
                return secure.encrypt(pass);
            }
            else if(command == 2){
                return secure.decrypt(pass);
            }
        }
        return null;
    }
}
