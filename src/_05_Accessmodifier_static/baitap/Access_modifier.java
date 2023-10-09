package _05_Accessmodifier_static.baitap;

public class Access_modifier {
    private double radius = 1.0;
    private String color = "red";
    public Access_modifier() {
    }
    public Access_modifier(double radius) {
        this.radius = radius;
    }

    // Phương thức getter
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    // Phương thức setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Phương thức tính diện tích
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {
        Access_modifier Circle = new Access_modifier();
        System.out.println("BK hinh tron la : "+Circle.getRadius()+" \nS cua hinh tron la "+Circle.getArea()+" \nmau cua hinh tron la "+Circle.getColor());
        System.out.println("------------------------------------------");
        Circle.setRadius(7);
        Circle.setColor("BLUE");
        System.out.println("BK hinh tron la : "+Circle.getRadius()+" \nS cua hinh tron la "+Circle.getArea()+" \nmau cua hinh tron la "+Circle.getColor());

    }
}
