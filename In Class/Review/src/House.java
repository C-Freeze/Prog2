public class House {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20);
        Rectangle r2 = new Rectangle(5, 10);

        System.out.printf("The area of thr house is: %.2f", (r1.getArea() + r2.getArea()));
    }
}
