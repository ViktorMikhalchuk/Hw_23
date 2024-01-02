package car;

public class CarDirector {
    public Car constructCar(CarBuilder builder) {
        builder.buildEngine();
        builder.buildWheels();
        builder.buildBody();
        return builder.getResult();
    }
}
