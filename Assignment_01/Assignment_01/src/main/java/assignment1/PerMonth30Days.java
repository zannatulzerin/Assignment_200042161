package assignment1;

public class PerMonth30Days extends Month{
    PerMonth30Days(int day, int month, int year) throws ExceptionClass {
        super(day, month, year);
        this.set_last_day(30);
    }
}
