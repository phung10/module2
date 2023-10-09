package _06_ke_thua.bai1;

public class Cylinder extends  Circle{
    private double hight ;

    public Cylinder(double radius, String color, double hight) {
        super(radius, color);
        this.hight = hight;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }
    public  double getacreage(){
        return getRadius()* 2* 3.14* hight;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + super.getRadius()+
                "color" +super.getColor() +
                "hight=" + hight +
                '}';
    }

    public static void main(String[] args) {
       Circle Circle= new Circle(5,"blue");
       System.out.println(Circle);

        System.out.println("Diện tích tam giác: "+ Circle.getArea());

        Cylinder cylinder= new Cylinder(5,"red",23);
        System.out.println(cylinder);
        System.out.println("Thể tích hình trụ: "+ cylinder.getacreage());
    }
}
