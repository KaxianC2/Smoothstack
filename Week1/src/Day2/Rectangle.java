package Day2;

public class Rectangle implements Shape{
    private int len;
    private int width;
    public Rectangle(){
        len = 0;
        width = 0;
    }
    /**
     * 
     * @param len - the length of the base
     * @param width - the length of the width
     */
    public Rectangle(int len, int width)
    {
        this.len = len;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return len*width;
    }

    public void display(){
        System.out.println("This is a Rectangle with height: "+len+", width: " + width + ", Area: " +calculateArea());
    }
    
}
