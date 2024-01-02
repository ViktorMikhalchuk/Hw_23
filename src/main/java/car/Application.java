package car;

public class Application {
    public static void main(String[] args) {
        CarDirector director = new CarDirector();

        CarBuilder sportsCarBuilder = new SportsCarBuilder();
        Car sportsCar = director.constructCar(sportsCarBuilder);
        System.out.println("Sports Car: " + sportsCar);

        CarBuilder suvBuilder = new SUVBuilder();
        Car suv = director.constructCar(suvBuilder);
        System.out.println("SUV: " + suv);
    }
}
