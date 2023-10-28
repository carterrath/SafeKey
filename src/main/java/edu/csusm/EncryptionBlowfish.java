package edu.csusm;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.Charset;
import java.util.Base64;

public class EncryptionBlowfish implements SecurePasswordIF {
    private String strkey = "secretBFKey";
    public String encrypt(String password) throws Exception{
        byte[] KeyData = strkey.getBytes();
        SecretKeySpec KS = new SecretKeySpec(KeyData, "Blowfish");
        Cipher cipher = Cipher.getInstance("Blowfish");
        cipher.init(Cipher.ENCRYPT_MODE, KS);
        String encryptedtext = Base64.getEncoder().
                encodeToString(cipher.doFinal(password.getBytes("UTF-8")));
        return encryptedtext;
    }
    public String decrypt(String password) throws Exception{
        byte[] KeyData = strkey.getBytes();
        SecretKeySpec KS = new SecretKeySpec(KeyData, "Blowfish");
        byte[] ecryptedtexttobytes = Base64.getDecoder().
                decode(password);
        Cipher cipher = Cipher.getInstance("Blowfish");
        cipher.init(Cipher.DECRYPT_MODE, KS);
        byte[] decrypted = cipher.doFinal(ecryptedtexttobytes);
        String decryptedString =
                new String(decrypted, Charset.forName("UTF-8"));
        return decryptedString;
    }
}