public class Rectangle {

    //Fields
    private double length;
    private double width;

    //Setters
    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //Getters
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    
    public double getArea() {
        return length * width;
    }

    //Constructor
    public Rectangle(double len, double wid) {
        length = len;
        width = wid;
    }


    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20);
        Rectangle r2 = new Rectangle(5, 10);
        System.out.println(r1.getArea());
        System.out.println(r2.getArea());
    }

}