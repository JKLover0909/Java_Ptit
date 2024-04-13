package THUC_HANH_BAI_3_12_11_NHOM_4_5_THAY_SON;
import java.util.*;
import java.math.BigInteger;
public class BAI7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        String s = sc.next();
        while (s.length() > 1) {
            String s1 = s.substring(0, s.length() / 2);
            String s2 = s.substring(s.length() / 2);
            BigInteger x = new BigInteger(s1);
            BigInteger y = new BigInteger(s2);
            BigInteger z = x.add(y);
            System.out.println(z);
            s = z.toString();
        }
    }
}
