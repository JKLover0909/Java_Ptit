import java.util.*;
import java.io.*;

public class Test{

    static String stdname(String s){
        String[] n = s.trim().toLowerCase().split("\\s+");
        String tmp = "";
        for(int i = 0; i<n.length; i++){
            tmp = tmp + Character.toUpperCase(n[i].charAt(0)) + n[i].substring(1) + ' ';
        }
        return tmp;
    }   
        
    static int tinhtiendien(int a, int b, int c){
        int d = b - a;
        if (d < c){return d*450; }
        return c*450;
    }

    static int tinhtienphat(int a, int b, int c){
        int d = b -a;
        if (d<c) return 0;
        return (d-c)*1000;
    }
    
    static String chamdiem(double a){
        if (a >=8) return "GIOI";
        else if (a >= 6.5) return "KHA";
        else if (a >= 5) return "TRUNG BINH";
        else return "KEM";
    }

    static int dinhmuc(String a){
        if (a == "A") return 100;
        if (a == "B") return 500;
        return 200;
    }

        
    static class uucuvien implements Comparable<uucuvien>{

        String ma, ten;
        int tiendien, tienphat, tra, tienthue;
        double dtb;

        public uucuvien(int i, String ten, String a, int b, int c ){
            this.ma = "KH" + String.format("%02d", i);
            this.ten = stdname(ten);
            this.tiendien = tinhtiendien(b, c, dinhmuc(a));
            this.tienphat = tinhtienphat(b, c, dinhmuc(a));
            this.tienthue = this.tienphat*(5/100);
            this.tra = this.tiendien + this.tienphat + this.tienthue;
        }

        @Override
        public String toString(){
            return ma + ' ' + ten + tiendien +' '+ tienphat + ' '+ tienthue+ ' ' +tra;
        }

        @Override
        public int compareTo( uucuvien o){
            if(this.tra < o.tra) return 1;
            if(this.tra > o.tra) return -1;
            return this.ma.compareTo(o.ma);
        }

    }

    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA1.in"));
        int n = sc.nextInt();
        uucuvien[] ucvs = new uucuvien[n];
        sc.nextLine();
        for(int i = 0; i<n; i++){
            
            String ten =sc.nextLine();
            String[] s = sc.nextLine().trim().split("\\s+");
            ucvs[i] = new uucuvien(i+1, ten, s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2]));
        }
        Arrays.sort(ucvs);
        
        for (int i = 0; i<n; i++) {
            System.out.println(ucvs[i]);
            
        }
    }
}