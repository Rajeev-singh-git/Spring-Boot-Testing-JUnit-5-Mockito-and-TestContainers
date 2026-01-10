package Controller;

public class MathUtils {

    public boolean isEven(int num){
        return num % 2 == 0;
    }

    public boolean isWeekDay(Days day){
        return day != Days.SATURDAY && day != Days.SUNDAY;
    }
}
