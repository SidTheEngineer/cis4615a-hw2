import java.math.BigInteger;

public class R04_STR03_J {
    public static BigInteger doNotEncodeNonCharacterDataAsStr() {
        BigInteger x = new BigInteger("530500452766");
        String s = x.toString();  // Valid character data
        byte[] byteArray = s.getBytes();
        String ns = new String(byteArray); 
        x = new BigInteger(ns);
        return x;
    }

    public static void main(String[] args) {
        // Should remain the original value: 530500452766
        System.out.println(doNotEncodeNonCharacterDataAsStr());
    }
}