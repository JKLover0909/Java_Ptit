import java.util.*;
import java.math.BigInteger;

public class Test1{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t = sc.nextInt();
        for (int i = 0; i<t ;i ++){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            System.out.println(a.add(b));
            System.out.println((a.subtract(b)).abs());
            System.out.println(a.multiply(b));
            System.out.println(a.divide(b));
        }
    }
}