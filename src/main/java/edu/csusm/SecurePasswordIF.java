package edu.csusm;

public interface SecurePasswordIF {
    public class EncryptionRSA();
    public class EncryptionAES();
    public void encrypt(String password)throws Exception;
    public void decrypt(byte[] encryptedPass)throws Exception;
}
