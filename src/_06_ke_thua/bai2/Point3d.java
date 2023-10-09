package _06_ke_thua.bai2;

import java.util.Arrays;

public class Point3d  extends Point2d{
    private float z ;

    public Point3d(){

    }

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        super.setXY(x,y);
        this.z = z;
    }
    public float[] getXYZ(){
        return new float[] {getX(),getY(),z};
    }
    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + super.getX() +
                ", y=" + super.getY() +
                ", z=" + z +
                '}';
    }

    public static void main(String[] args) {
        Point2d point2D = new Point2d(2,3);
        System.out.println(point2D);
        System.out.println(Arrays.toString(point2D.getXY()));

        Point3d point3D = new Point3d(4, 6, 6);
        System.out.println(point3D);
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
