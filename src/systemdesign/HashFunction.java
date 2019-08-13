package systemdesign;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashFunction {

	public static void main(String[] args) {
		
		String url="https://howtodoinjava.com/security/how-to-generate-secure-password-hash-md5-sha-pbkdf2-bcrypt-examples/";
		try {
			MessageDigest myDigest=MessageDigest.getInstance("MD5");
			byte[] hashBytes=myDigest.digest(url.getBytes());
			BigInteger no=new BigInteger(1,hashBytes);
			
			String hashtext = no.toString(16); 
            while (hashtext.length() < 32) { 
                hashtext = "0" + hashtext; 
            } 
            
            System.out.println(hashtext);
			
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
