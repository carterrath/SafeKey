package edu.csusm;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;

public class EncryptionAES implements SecurePasswordIF{

    public void encrypt(String pass)throws Exception {
        String key = "Bar12345Bar12345";
        Key aesKey = new SecretKeySpec(key.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(1, aesKey);
        byte[] encrypted = cipher.doFinal(pass.getBytes());
    }


    public void decrypt(byte[] encryptedPass)throws Exception {
        byte[] b = encryptedPass;
        String key = "Bar12345Bar12345";
        Key aesKey = new SecretKeySpec(key.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(2, aesKey);
        String decrypted = new String(cipher.doFinal(b));

    }
}
