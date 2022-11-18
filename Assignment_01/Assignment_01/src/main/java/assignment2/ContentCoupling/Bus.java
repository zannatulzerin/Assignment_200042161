package assignment2.ContentCoupling;

public class Bus {
    public int SpeedCalculation(Vehicle vehicle){
        vehicle.speed= vehicle.distance / vehicle.time;
        return vehicle.speed;
    }
}
