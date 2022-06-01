import java.util.*;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class check {
	
	
	public static byte[] getSHA(String input) throws NoSuchAlgorithmException
    {
        // Static getInstance method is called with hashing SHA
        MessageDigest md = MessageDigest.getInstance("SHA-256");
 
        // digest() method called
        // to calculate message digest of an input
        // and return array of byte
        return md.digest(input.getBytes(StandardCharsets.UTF_8));
    }
     
    public static String toHexString(byte[] hash)
    {
        // Convert byte array into signum representation
        BigInteger number = new BigInteger(1, hash);
 
        // Convert message digest into hex value
        StringBuilder hexString = new StringBuilder(number.toString(16));
 
        // Pad with leading zeros
        while (hexString.length() < 64)
        {
            hexString.insert(0, '0');
        }
 
        return hexString.toString();
    }
	

	public static void main(String[] args) {
		try
        { Scanner sc=new Scanner(System.in);
           String str=sc.nextLine();
            int x=1;
           str=str+Integer.toString(x);
           long initial=System.currentTimeMillis();
            while(toHexString(getSHA(str)).compareTo("0x00000FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF")>=0) {
           	     str=str.substring(0,str.length()-1);
           	     x++;
           	     str=str+Integer.toString(x);
            }
          long fin=System.currentTimeMillis();
			
			
			System.out.println("Required positive integer  x = "+x);
			System.out.println("Time taken in milliseconds to find the required number x is "+(fin-initial)+" milliseconds");
			sc.close();
		
 
        }
        // For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
            System.out.println("Exception thrown for incorrect algorithm: " + e);
        }
	}			
				
				
			  
	
	

}
