public class Main {
    public static void main(String[] args) {
        CarFabric carFabric = new CarFabric();
        Car lada = carFabric.createCar(CarType.LADA);
        lada.info();
        lada.sound();
        System.out.println();
        Car nissan = carFabric.createCar(CarType.NISSAN);
        nissan.info();
        nissan.sound();
        System.out.println();
        Car ferrari = carFabric.createCar(CarType.FERRARI);
        ferrari.info();
        ferrari.sound();
        System.out.println();
    }
}