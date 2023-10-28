package edu.csusm;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

public class EncryptionAES implements SecurePasswordIF{
    private String secretKey = "secretAESKey";
    private static SecretKeySpec keySpec;
    private static byte[] key;
    private static final String ALGORITHM = "AES";

    public void prepareSecreteKey(String myKey) {
        MessageDigest sha = null;
        try {
            key = myKey.getBytes(StandardCharsets.UTF_8);
            sha = MessageDigest.getInstance("SHA-1");
            key = sha.digest(key);
            key = Arrays.copyOf(key, 16);
            keySpec = new SecretKeySpec(key, ALGORITHM);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
    @Override
    public String encrypt(String strToEncrypt) {
        try {
            prepareSecreteKey(secretKey);
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, keySpec);
            return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));
        } catch (Exception e) {
            System.out.println("Error while encrypting: " + e.toString());
        }
        return null;
    }
    @Override
    public String decrypt(String strToDecrypt) {
        try {
            prepareSecreteKey(secretKey);
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, keySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));
        } catch (Exception e) {
            System.out.println("Error while decrypting: " + e.toString());
        }
        return null;
    }
}
