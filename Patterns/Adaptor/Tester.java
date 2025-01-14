public class Tester {
    public static void main(String[] args) {
        EnglishCar car = new EnglishCar("Rolls-royce", 30.0);
        System.out.printf("%s speed is %.2f mph.%n", car.getName(), car.getSpeed());

        Speedometer speedometer = new Speedometer(car);
        System.out.printf("%s speed is %.2f km/h.%n", car.getName(), speedometer.getSpeedMeasurement());
    }
}
