package assignment1;

public class PerMonth31Days extends Month{
    PerMonth31Days(int day, int month, int year) throws ExceptionClass {
        super(day, month, year);
        this.set_last_day(31);
    }
}
