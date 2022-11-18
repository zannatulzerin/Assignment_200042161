package assignment2.StampCoupling;

public class Jaguar {
    private String Model;
    public int price;
    public String engine;
    public String Specs;

    public Jaguar(Car car,String specs){
        this.Model = car.ModelName;
        this.price = car.price;
        this.engine = car.engine;
        this.Specs = specs;
    }
}
