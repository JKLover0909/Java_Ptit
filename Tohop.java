import java.util.Scanner;
import java.util.ArrayList;

public class Tohop{
    public static Scanner sc = new Scanner(System.in);
    public static int cnt = 0;
    public static int[] a = new int[15];

    public static void Try(int i, int n, int k){
        for(int j = a[i-1]+1; j <= n - k + i; j++){
            a[i] = j;
            if(i == k){
                cnt++;
                for (int l = 1; l<=k; l++){
                    System.out.print(a[l]);
                }
                System.out.print(" ");
            }
            else Try(i+1, n, k);
        }
    }

    public static void main(String[] args){
        int n = sc.nextInt(), k = sc.nextInt();
        Try(1, n, k);
        System.out.println();
        System.out.println("Tong cong co " + cnt + " to hop");
    }
}