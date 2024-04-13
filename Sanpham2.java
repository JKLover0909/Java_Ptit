import java.io.IOException;
import java.lang.reflect.Array;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;

class sanpham implements Comparable<sanpham>{
    String ma, ten;
    int gia, bh;

    public sanpham(String ma, String ten, int gia, int bh){
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.bh = bh;
    }

    @Override
    public int compareTo(sanpham o){
        if(this.gia > o.gia) return -1;
        else if(this.gia < o.gia) return 1;
        else return this.ma.compareTo(o.ma);
    }

    @Override 
    public String toString(){
        return String.format("%s %s %d %d", ma, ten, gia, bh);
    }
}

public class Sanpham2{
    public static void main(String[] args) throws IOException, ParseException{
            Scanner sc =  new Scanner(new File("SANPHAM.in"));
            int n = Integer.parseInt(sc.nextLine());
            sanpham[] arr = new sanpham[n];
            for (int i = 0; i < n; i++) {
                String a = sc.nextLine();
                String b = sc.nextLine();
                int c = Integer.parseInt(sc.nextLine());
                int d = Integer.parseInt(sc.nextLine());
                arr[i] = new sanpham(a, b, c, d);
            }
            Arrays.sort(arr);
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);
        }
    }
}    

