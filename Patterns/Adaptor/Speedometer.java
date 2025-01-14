public class Speedometer {
    private EnglishCar car;

    public Speedometer(EnglishCar car){
        this.car = car;
    }

    //adapter
    public double getSpeedMeasurement(){
        double speed = this.car.getSpeed();
        return speed * 1.60934;
    }
}
