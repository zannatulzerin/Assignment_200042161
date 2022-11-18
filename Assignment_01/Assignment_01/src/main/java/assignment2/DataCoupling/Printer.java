package assignment2.DataCoupling;

public class Printer {
    Operations operations = new Operations();

    public void Print(String message){
        System.out.println(operations.print(message));
    }
}
