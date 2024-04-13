import java.io.*;
import java.text.ParseException;
import java.util.*;

class monhoc implements Comparable<monhoc>{
    String ma, ten, hinhthuc;

    public monhoc(String ma, String ten, String hinhthuc){
        this.ma = ma;
        this.ten = ten;
        this.hinhthuc = hinhthuc;
    }

    @Override
    public int compareTo(monhoc o){
        return this.ma.compareTo(o.ma);
    }

    @Override
    public String toString(){
        return String.format("%s %s %s", ma, ten, hinhthuc);
    }
}

public class CompareClass{
    public static void main(String[] args) throws IOException, ParseException{
            Scanner sc = new Scanner(new File("MONHOC.in"));
            int n = Integer.parseInt(sc.nextLine());
            monhoc[] arr = new monhoc[n];
            for (int i = 0; i < n; i++) {
                String a = sc.nextLine();
                String b = sc.nextLine();
                String c = sc.nextLine();
                arr[i] = new monhoc(a, b, c);
            }
            Arrays.sort(arr);
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);
        }
    }
}