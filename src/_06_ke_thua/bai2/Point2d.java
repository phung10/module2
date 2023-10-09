package _06_ke_thua.bai2;

public class Point2d {
    private float x;
    private float y;

    public Point2d(){

    }
    public Point2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y ){
        this.x= x;
        this.y= y;
    }
    public float[] getXY(){
        return new float[] {x,y};
    }

    @Override
    public String toString() {
        return "Point2d{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
