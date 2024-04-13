import java.util.Arrays;
import java.util.Scanner;

public class HoanVi{
    public static Scanner sc = new Scanner(System.in);
    public static int[] a = new int[15];
    public static int[] mark = new int[15];
    public static int n;
    
    static boolean check(){
        for (int i = 1; i<n; i++){
            if (Math.abs(a[i] - a[i+1]) == 1)
                return false;
        }
        return true;

    }

    static void Try(int i){
        for (int j = 1; j<=n; j++){
            if(mark[j] == 0){
                a[i] = j;
                mark[j] = 1;
                if (i == n){
                    if (check()){
                        for (int l = 1; l<=n; l++){
                            System.out.print(a[l]);
                        }
                        System.out.println();
                    }
                }
                else Try(i+1);
                mark[j] = 0;
            }
        }
    }


    public static void main(String[] args){
        int t = sc.nextInt();  
        while (t-->0){
            Arrays.fill(mark, 0);
            Arrays.fill(a, 0);
            n = sc.nextInt();
            Try(1);
        }
    }
}