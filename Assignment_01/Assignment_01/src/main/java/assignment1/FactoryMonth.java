package assignment1;

import java.util.Arrays;
import java.util.List;

public class FactoryMonth {
    List<Integer> PerMonth30Days = Arrays.asList(4,6,9,11);
    List<Integer> PerMonth31Days = Arrays.asList(1,3,5,7,8,10,12);

    public Month month;
    public FactoryMonth(int day, int month, int year) throws ExceptionClass {
        if(PerMonth30Days.contains(month)){
            if(day > 30 || day < 1){
                throw  new ExceptionClass("Month is invalid.");
            }
            this.month = new PerMonth30Days(day, month, year);
        }
        else if(PerMonth31Days.contains(month)){
            if(day > 31 || day < 1){
                throw  new ExceptionClass("Month is invalid.");
            }
            this.month = new PerMonth31Days(day, month, year);
        }
        else if(month == 2){
            if(day>29 || day<1){
                throw new ExceptionClass("Month is invalid.");
            }
            this.month = new FebruaryInLeapYear(day, year);
        }
        else{
            throw new ExceptionClass("Month is invalid.");
        }
    }
    public String get_next_date(){
        month.set_next_day();
        String str = month.getDay() + " " + month.getMonth() + " " + month.getYear();
        return str;
    }


}
