public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(5);

        System.out.println("Radius circle1: " + circle1.getRadius());
        System.out.println("Area circle1: " + circle1.getArea());

        System.out.println("Radius circle2: " + circle2.getRadius());
        System.out.println("Area circle2: " + circle2.getArea());
    }
}