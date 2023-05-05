package edu.csusm;

import java.util.Base64;
import javax.crypto.Cipher;
import java.security.*;

public class EncryptionRSA implements SecurePasswordIF {
    //  public void rsa()throws NoSuchPaddingException,NoSuchPaddingException,InvalidKeyException,BadPaddingException {
    //initializing the public and private key
    private PrivateKey privateKey;
    private PublicKey publicKey;

    //key generator to make sure kleys matches
    //encrypt user's password
    public void encrypt(String password) throws Exception {//NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, NoSuchPaddingException, BadPaddingException{
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        //initializing random
        SecureRandom r = new SecureRandom(); //initialize random number
        keyGen.initialize(2048, r);
        KeyPair pair = keyGen.generateKeyPair();
        PublicKey publicKey = pair.getPublic(); //pair public key
        String publicKeyString = Base64.getEncoder().encodeToString(publicKey.getEncoded());
        //System.out.println("public key = "+ publicKeyString);
        PrivateKey privateKey = pair.getPrivate(); //pair priv key
        String privateKeyString = Base64.getEncoder().encodeToString(privateKey.getEncoded());

        Cipher encryptionCipher = Cipher.getInstance("RSA");
        encryptionCipher.init(Cipher.ENCRYPT_MODE, privateKey);
        //String message = "Hello world";
        byte[] encryptedPass = encryptionCipher.doFinal(password.getBytes());
        String encryption = Base64.getEncoder().encodeToString(encryptedPass);
        System.out.println("encrypted message = " + encryption);
    }

    //decrypt the encrypted password
    public void decrypt(byte[] encryptedPass) throws Exception{//NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        Cipher decryptionCipher = Cipher.getInstance("RSA");
        decryptionCipher.init(Cipher.DECRYPT_MODE, publicKey);
        byte[] decryptedPass = decryptionCipher.doFinal(encryptedPass); //decrypting the encrypted pass
        String decryption = new String(decryptedPass);
        System.out.println("decrypted message = " + decryption);
    }

}
