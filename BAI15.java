package THUC_HANH_BAI_3_12_11_NHOM_4_5_THAY_SON;
import java.util.*;
import java.io.*;
class Sinhvien1 implements Comparable<Sinhvien1>{//Dùng cho DSSV ban đầu
    private String msv, ten, lop, mail, sdt, GVHD, deTai;
    public Sinhvien1(String msv, String ten, String lop, String mail, String sdt) {
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
        this.sdt = "0" + sdt;
    }
    public String getMsv() {
        return msv;
    }
    public String getSdt() {
        return sdt;
    }
    public String toString(){
        return this.msv + " " + this.ten + " " + this.GVHD + " " + this.deTai + " " + this.sdt;
    }
    public void solve(String GVHD, String deTai){
        this.GVHD = GVHD;
        this.deTai = deTai;
    }
    public String getDeTai() {
        return deTai;
    }
    @Override
    public int compareTo(Sinhvien1 t) {
        return this.msv.compareTo(t.msv);
    }
}
class Sinhvien2{//DSSV của GVHD quản lý
    private String msv, detai;
    public Sinhvien2(String msv, String detai) {
        this.msv = msv;
        this.detai = detai;
    }
    public String getMsv() {
        return msv;
    }
    public String getDetai() {
        return detai;
    }
}
class GiangVien{
    private String ten;
    private int soSinhVien;
    private ArrayList<Sinhvien2>a;
    public GiangVien(String ten, int soSinhVien) {
        this.ten = ten;
        this.soSinhVien = soSinhVien;
    }
    public void setA(ArrayList<Sinhvien2> a) {
        this.a = a;
    }  
}
public class BAI15{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<Sinhvien1>a = new ArrayList<>();
        while(sc.hasNextLine()){
            a.add(new Sinhvien1(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        sc = new Scanner(new File("HUONGDAN.in"));
        int n = sc.nextInt();//số GVHD
        sc.nextLine();
        GiangVien []b = new GiangVien[n];
        for(int i = 0;i<n;i++){//Xét từng giảng viên
            String s = sc.nextLine();//Nhập tên GVHD và số đề tài
            String []tmp = s.trim().split("\\s+");
            String res = "";//GV hướng dẫn
            for(int j = 0;j<tmp.length-1;j++) res+=tmp[j] + " ";
            int m = Integer.parseInt(tmp[tmp.length - 1]);//Số đề tài
            b[i] = new GiangVien(res.trim(), m);
            //Nhập danh sách sinh viên hướng dẫn của mỗi GV
            ArrayList<Sinhvien2>c = new ArrayList<>();
            for(int k = 0;k<m;k++){
                String h = sc.nextLine();
                String []h1 = h.trim().split("\\s+");
                String h2 = "";
                for(int l = 1;l<h1.length;l++) h2+=h1[l] + " ";
                c.add(new Sinhvien2(h1[0].trim(), h2.trim()));
            }
            //Gán DS ấy cho GV
            b[i].setA(c);
            for(Sinhvien1 y: a){ //Duyệt từng SV trong DSSV ban đầu
                for(Sinhvien2 x: c){ //Duyệt từng SV trong DSSV của GV đang xét quản lý
                    if(x.getMsv().equals(y.getMsv())){
                        y.solve(res.trim(), x.getDetai().trim());
                        //Cập nhật thông tin: Gán tên GVHD và đề tài tương ứng
                        break;
                    }
                }
            }         
        }
        Collections.sort(a);
        for(Sinhvien1 x: a){
            if(x.getDeTai()!=null) System.out.println(x);
        }
    }
}
