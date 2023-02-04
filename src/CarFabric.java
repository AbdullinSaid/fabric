enum CarType {
    FERRARI,
    LADA,
    NISSAN
}

public class CarFabric {
    public Car createCar(CarType type) {
        Car car = switch (type) {
            case LADA -> new Lada();
            case NISSAN -> new Nissan();
            case FERRARI -> new Ferrari();
        };

        return car;
    }
}
