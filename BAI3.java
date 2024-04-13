import java.util.*;
import java.io.*;
class Matrix {
    private int n, m;
    private int[][] a;
    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        this.a = new int[n][m];
    }
    public void setA(int[][] a) {
        this.a = a;
    }
    public void sapXep(int k) {
        for(int i = 0;i<n;i++){
            for(int j = i;j<n;j++){
                if(this.a[i][k - 1] > this.a[j][k - 1]){ 
                    int tmp = this.a[i][k - 1];
                    this.a[i][k - 1] = this.a[j][k - 1];
                    this.a[j][k - 1] = tmp;
                }
            }
        }
    }
    public void in() {
        for(int i = 0;i<this.n;i++){ 
            for(int j = 0;j<this.m;j++) System.out.print(this.a[i][j] + " ");
            System.out.println();
        }
    }
}

public class BAI3 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) a[i][j] = sc.nextInt();
            }
            Matrix b = new Matrix(n, m);
            b.setA(a);
            b.sapXep(k);
            b.in();
        }
    }
}
