package edu.csusm;

public interface SecurePasswordIF {
    public String encrypt(String pass) throws Exception;
    public String decrypt(String encryptedPass) throws Exception;

}
