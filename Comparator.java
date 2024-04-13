import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;


class dongho{
    int gio, phut, giay;

    public dongho(int gio, int phut, int giay){
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }
}    

public class Comparator{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t = sc.nextInt();
        sc.nextLine();
        dongho[] arr = new dongho[t];
        for(int i = 0; i < t; i++){
            String[] s = sc.nextLine().split("\\s+");
            arr[i] = new dongho(Integer.parseInt(s[0]), Integer.parseInt(s[1]), Integer.parseInt(s[2]));
        }
        Arrays.sort(arr, new Comparator<dongho>(){
            @Override
            public int compare(dongho o1, dongho o2){
                if(o1.gio > o2.gio) return 1;
                else if(o1.gio < o2.gio) return -1;
                else{
                    if(o1.phut > o2.phut) return 1;
                    else if(o1.phut < o2.phut) return -1;
                    else{
                        if(o1.giay > o2.giay) return 1;
                        else if(o1.giay < o2.giay) return -1;
                        else return 0;
                    }
                }
            }
        });
        for(int i = 0; i < t; i++){
            System.out.printf("%d %d %d\n", arr[i].gio, arr[i].phut, arr[i].giay);
        }
    }
}