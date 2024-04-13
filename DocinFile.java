import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DocinFile {
    public static Scanner sc = new Scanner(System.in);

    static boolean check(String s){
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(0) == '-') continue;
            if(!Character.isDigit(s.charAt(i))) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("DATA.in"));
        String s = null;
        long sum = 0;
        while(sc.hasNextLine()){
            s = sc.nextLine().trim();
            if(s.equals("")) continue;
            String[] ss = s.split("\\s+");
            for(int i = 0; i< ss.length; i++){
                if(ss[i].length() > 9) continue;
                if(check(ss[i])){
                    if(Long.valueOf(ss[i]) <= 2147483647 && Long.valueOf(ss[i]) >= -2147483647){
                        sum += Integer.valueOf(ss[i]);
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
