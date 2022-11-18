package assignment1;

public class Month {
    public int day, month, year, last_day, last_month = 12;

    public Month(int day, int month, int year) throws ExceptionClass
    {
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    boolean leap_year(){
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            return true;
        }
        else{
            return false;
        }
    }
    public void set_last_day(int last_day){
        this.last_day=last_day;
    }
    public void set_next_day(){
        if(day == last_day){
            day = 0;
            if(month == last_month){
                month = 1;
                year++;
            }
            else{
                month++;
            }
        }
        day++;
    }
}
