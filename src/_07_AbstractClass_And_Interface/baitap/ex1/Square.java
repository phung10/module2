package _07_AbstractClass_And_Interface.baitap.ex1;

public class Square extends Rectangle{
//    public Square(){
//        super(1,1);
//    }
//
//    public Square(double side) {
//        super(side, side);
//    }
//
//    public Square(double side, String color, boolean filled) {
//       super(color, filled, side, side);
//    }
    public  Square (){
        super(1,1);
    }
    public Square (double side){
        super(side,side);
    }
    public Square(double side,String color, boolean filled){
        super(color,filled,side,side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }
    @Override
    public void setLength(double width) {
        setSide(width);
    }



    @Override
    public String toString() {
        return "hình vuông có cạnh " + getSide() +
                "\nĐó là lớp con của: " + super.toString();

    }
}
