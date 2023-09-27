package _04_OOP_java.baitap;

public class Fan {
    public static final int SLOW = 1, MEDIUM = 2, FAST  = 3;
    private int speed;
    private boolean on;

    private  double radius;

    private String color;

    public int getSpeed() {
        this.speed = SLOW;
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        this.on = false ;
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        this.radius = 5;
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        this.color = "blue";
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        if(this.on) {
            return "Speed: " + this.speed + ", Color: " + this.color + ", Radius: " + this.radius + " - fan is on";
        }else {
            return getColor() + getRadius() ;

        }
    }
    public static void main(String[] args) {
       Fan fan1 = new Fan();
        fan1.setSpeed(SLOW);
        fan1.setRadius(10.0);
        fan1.setColor("yellow");
        fan1.setOn(true);

        Fan fan2 = new Fan();
//        fan2.setSpeed(MEDIUM);
//        fan2.setRadius(5.0);
//        fan2.setColor("blue");
        fan2.setOn(false);

        System.out.println("Fan 1: " + fan1);
        System.out.println("Fan 2: " + fan2.toString());
    }
}