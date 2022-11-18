package assignment1;


import org.junit.Test;



public class CalenderTest {
    @Test
    public void TestDay() throws ExceptionClass {
        FactoryMonth factoryMonth = new FactoryMonth(19,11,2022);
        System.out.println(factoryMonth.get_next_date());
    }
    @Test
    public void TestMonth() throws ExceptionClass {
        try {
            FactoryMonth factoryMonth = new FactoryMonth(19, 13, 2022);
            System.out.println(factoryMonth.get_next_date());
        } catch (ExceptionClass e) {
            System.out.println("Month exception!");
        }
    }
    @Test
    public void TestYear() throws ExceptionClass {
        try {
            FactoryMonth factoryMonth = new FactoryMonth(19, 13, 0);
            System.out.println(factoryMonth.get_next_date());
        } catch (ExceptionClass e) {
            System.out.println("Year exception!");
        }
    }

    @Test
    public void TestLeapYear() throws ExceptionClass {
        try {
            FactoryMonth factoryMonth = new FactoryMonth(29, 02, 2022);
            //
            System.out.println("Leap year!");

        } catch (ExceptionClass e) {
            System.out.println("Not leap year!");
        }
    }
    @Test
    public void Test31Days() throws ExceptionClass {
        FactoryMonth factoryMonth = new FactoryMonth(31,12,2022);
        System.out.println(factoryMonth.get_next_date());
    }
    @Test
    public void Test30Days() throws ExceptionClass {
        FactoryMonth factoryMonth = new FactoryMonth(30,11,2022);
        System.out.println(factoryMonth.get_next_date());
    }
}
