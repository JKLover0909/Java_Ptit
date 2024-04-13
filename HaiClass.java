import java.util.Scanner;

class point{
    int x, y;
    public point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double distance(point p){
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }
}

class tamgiac{
    point a, b, c;

    public tamgiac(point a, point b, point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean check(){
        double ab = a.distance(b);
        double bc = b.distance(c);
        double ca = c.distance(a);
        if(ab + bc > ca && ab + ca > bc && bc + ca > ab) return true;
        return false;
    }

    public double chuvi(){
        double ab = a.distance(b);
        double bc = b.distance(c);
        double ca = c.distance(a);
        return ab + bc + ca;
    }
}

public class HaiClass {
    
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t = sc.nextInt();
        sc.nextLine();
        while(t--> 0){
            String[] s1 = sc.nextLine().split("\\s+");
            point a = new point(Integer.parseInt(s1[0]), Integer.parseInt(s1[1]));
            point b = new point(Integer.parseInt(s1[2]), Integer.parseInt(s1[3]));
            point c = new point(Integer.parseInt(s1[4]), Integer.parseInt(s1[5]));
            tamgiac tg = new tamgiac(a, b, c);
            if(tg.check()){
                System.out.printf("%.3f\n", tg.chuvi());
            }
            else System.out.println("INVALID");
        }
    }
}
