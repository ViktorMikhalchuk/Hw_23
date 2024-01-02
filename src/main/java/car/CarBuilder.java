package car;

public interface CarBuilder {
    void buildEngine();
    void buildWheels();
    void buildBody();
    Car getResult();
}
