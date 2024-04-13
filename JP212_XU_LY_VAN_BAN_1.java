
import java.util.*;
import java.io.*;
public class JP212_XU_LY_VAN_BAN_1 {
    public static int check(String x){
        char s[] = x.toCharArray();
        char lastChar = s[s.length - 1];
        if(lastChar == '.' || lastChar == ',' || lastChar == '?' || lastChar == '!') {
            return 0;
        }
        for(int i = 0; i < s.length; i++){
            if(Character.isDigit(s[i])) {
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("VANBAN.in"));
        TreeSet<String>a = new TreeSet<>();
        while(sc.hasNext()){
            String s = sc.next();
            if(check(s)==1) a.add(s);
        }
        for(String x: a) System.out.println(x);
    }
}
