package Day2;
import java.lang.Math;

public class Circle implements Shape{
    private int radius;
    public Circle(){
        radius = 0;
    }
    /**
     * @param r - radius of the circle
     */
    public Circle(int r)
    {
        this.radius = r;
    }

    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }

    public void display(){
        System.out.println("This is a Circle with radius: "+radius+", Area: " +calculateArea());
    }
    
}
