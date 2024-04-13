import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

class Monhoc {
    String id, name;
}

class Giangvien {
    String id, name;
    double totalHours = 0;
}

class Giochuan {
    String lecturerId, subjectId;
    double hours;
}

public class Test3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br;
        DecimalFormat df = new DecimalFormat("#.00");
        ArrayList<Monhoc> a = new ArrayList<>();
        ArrayList<Giangvien> b = new ArrayList<>();
        ArrayList<Giochuan> c = new ArrayList<>();

        br = new BufferedReader(new FileReader("GIANGVIEN.in"));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split("\\s+");
            Giangvien x = new Giangvien();
            x.id = s[0];
            String tmp ="";
            for(int j=1;j<s.length;j++){
                tmp+=s[j]+" ";
            }
            x.name = tmp.trim();
            b.add(x);
        }
        br.close();

        br = new BufferedReader(new FileReader("GIOCHUAN.in"));
        n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split("\\s+");
            Giochuan x = new Giochuan();
            x.lecturerId = s[0];
            x.subjectId = s[1];
            x.hours = Double.parseDouble(s[2]);
            c.add(x);
        }
        br.close();

        for (Giochuan sh : c) {
            for (Giangvien l : b) {
                if (l.id.equals(sh.lecturerId)) {
                    l.totalHours += sh.hours;
                    break;
                }
            }
        }

        for (Giangvien l : b) {
            System.out.println(l.name + " " + df.format(l.totalHours));
        }
    }
}