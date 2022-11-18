package assignment1;

public class FebruaryInLeapYear extends Month{
    public FebruaryInLeapYear(int day, int year) throws ExceptionClass {
        super(day, 2, year);
        if(this.leap_year()){
            this.set_last_day(29);
        }
        else{
            this.set_last_day(28);
        }
    }
}
