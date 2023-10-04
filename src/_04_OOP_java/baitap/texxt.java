package _04_OOP_java.baitap;

public class texxt {

    private String hoten;
    private double diem;

       public texxt(){
          hoten = "name";
          diem = 0.0;
     }

    public texxt(String hoten, double diem) {
        this.hoten = hoten;
        this.diem = diem;
    }

    public texxt(String hoten) {
        this.hoten = hoten;
    }

    public texxt(double diem) {
        this.diem = diem;
    }

    public String getHoten() {
        return hoten;
    }

    public double getDiem() {
        return diem;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public void  hienthithongtin(){
        System.out.printf(hoten+ " : " +diem);
        System.out.printf("\n");

    }
    public double dtb(double diemtoan,double diemvan){
           return (diemtoan+diemvan)/2;
    }
    public static void main(String[] args) {
        texxt texxt1 = new texxt();
        texxt texxt2 = new texxt("phung", 9.5);
        texxt1.hienthithongtin();
        texxt2.hienthithongtin();
        texxt texxt3 = new texxt( 9);
        texxt texxt4 = new texxt("phung");
        texxt3.hienthithongtin();
        texxt4.hienthithongtin();
        System.out.println(texxt2.getHoten());
        System.out.print(texxt2.getDiem());
        texxt2.setDiem(10);
        texxt2.hienthithongtin();
        double dtbsv4 = texxt4.dtb(7.2,2);
        System.out.print(dtbsv4);

    }
}
