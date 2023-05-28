package Repl;

public class Time {

    int hour = 11;
    int min = 30;

    Time(int hour, int min) {
        this.hour = hour;
        this.min = min;
    }

    void printInfo() {
        System.out.println(hour + ":" + min);
    }
    public static void main(String[] args) {

        Time time=new Time(11,30);
        time.printInfo();
    }
}


