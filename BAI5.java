import java.util.*;
public class BAI5 {
    public static long calc(long x, long y, String s){
        if(s.equals("+")) return x + y;
	else if (s.equals("-")) return x - y;
	else if (s.equals("*")) return x * y;
	else return x/y;
    }
    public static boolean isOperand(String s){
        if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            int n = Integer.parseInt(sc.nextLine());
            String s = sc.nextLine();
            String []tmp = s.trim().split("\\s+");
            Stack<Long>st = new Stack<>();
            for(int i = tmp.length - 1;i>=0;i--){ 
                if(!isOperand(tmp[i])){
                   st.push(Long.parseLong(tmp[i]));
                } else { 
                    long x = st.pop(), y = st.pop();
                    long z = calc(x, y, tmp[i]);
                    st.push(z);
                }
            }
            System.out.println(st.pop());
        }
    }
}
