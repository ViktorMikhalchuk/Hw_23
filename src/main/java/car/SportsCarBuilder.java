package car;

public class SportsCarBuilder implements CarBuilder{
    private Car car = new Car();

    @Override
    public void buildEngine() {
        car.setEngine("Sports Engine");
    }

    @Override
    public void buildWheels() {
        car.setWheels("Sports Wheels");
    }

    @Override
    public void buildBody() {
        car.setBody("Sports Body");
    }

    @Override
    public Car getResult() {
        return car;
    }
}
