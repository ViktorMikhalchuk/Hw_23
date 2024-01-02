package car;

public class SUVBuilder implements CarBuilder{
    private Car car = new Car();

    @Override
    public void buildEngine() {
        car.setEngine("SUV Engine");
    }

    @Override
    public void buildWheels() {
        car.setWheels("SUV Wheels");
    }

    @Override
    public void buildBody() {
        car.setBody("SUV Body");
    }

    @Override
    public Car getResult() {
        return car;
    }
}
