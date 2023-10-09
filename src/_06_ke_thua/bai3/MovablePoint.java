package _06_ke_thua.bai3;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint() {
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        return new float[] {xSpeed,ySpeed};
    }
    public MovablePoint move(){
        super.setX(xSpeed+super.getX());
        super.setY(ySpeed+super.getY());
        return this;

    }

    @Override
    public String toString() {
        return super.toString() + ",speed=("+ xSpeed + "," + ySpeed + ")";
    }

    public static void main(String[] args) {
        Point point = new Point(2,4);
        System.out.println(point);

        MovablePoint movablePoint = new MovablePoint(1,2,3,4);
        System.out.println(movablePoint.move());
    }
}
