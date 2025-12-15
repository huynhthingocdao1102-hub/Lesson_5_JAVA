public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3", "Skyativ 3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Mazda 2", "Skyativ 2");
        System.out.println(Car.numberOfCars);
    }
}