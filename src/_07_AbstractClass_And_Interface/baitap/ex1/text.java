package _07_AbstractClass_And_Interface.baitap.ex1;

import java.util.Random;

public class text {
    public static void main(String[] args) {
        Shape[] arr = new Shape[3];
        arr[0]= new Circle(4, "black", true);
        arr[1]= new Rectangle("red", false, 3, 4);
        arr[2]= new Square(12,"blue", false);


        for(Shape e : arr){
            if(!(e instanceof Square)){
                System.out.println(e.getClass().getSimpleName());
                e.resize((new Random()).nextInt(23));
                System.out.println(e);
                System.out.println("-------------");
            }
        }

    }
}
