package THUC_HANH_BAI_3_12_11_NHOM_4_5_THAY_SON;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
import static java.util.Collections.max;
import static java.util.Collections.min;
public class BAI6 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<BigInteger>a = new ArrayList<>();
        BigInteger res = new BigInteger("0");
        for(int i = 0;i<n;i++){
            String s = sc.nextLine();
            BigInteger tmp = new BigInteger(s);
            a.add(tmp);
            res = res.add(tmp);
        }
        System.out.println(min(a));
        System.out.println(max(a));
        System.out.println(res);
    }
}

