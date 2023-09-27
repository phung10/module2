package _04_OOP_java.thuchanh;

import java.awt.*;
import java.util.Scanner;

public class hcn {
    double dai, rong;

//    public  hcn() {
//    }

    public  hcn(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double getArea() {
        return this.dai * this.rong;
    }

    public double getPerimeter() {
        return (this.rong + this.dai) * 2;
    }

    public String display() {
        return "Rectangle{" + "width=" + dai + ", height=" + rong + "}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double dai = scanner.nextDouble();
        System.out.print("Enter the height:");
        double rong = scanner.nextDouble();
        hcn hcn = new hcn(dai, rong);
        System.out.println("Your Rectangle \n" + hcn.display());
        System.out.println("Perimeter of the Rectangle: " + hcn.getPerimeter());
        System.out.println("Area of the Rectangle: " + hcn.getArea());
    }
}

