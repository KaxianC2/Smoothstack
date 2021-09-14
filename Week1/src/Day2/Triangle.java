package Day2;

public class Triangle implements Shape{
    private int height;
    private int base;
    public Triangle(){
        height = 0;
        base = 0;
    }
    /**
     * 
     * @param height - the length of the height
     * @param base - the length of the base
     */
    public Triangle(int height, int base)
    {
        this.height = height;
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return (height*base)/2;
    }

    public void display(){
        System.out.println("This is a Right Triangle with height: "+height+", width: " + base + ", Area: " +calculateArea());
    }
}
