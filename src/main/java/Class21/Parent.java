package Class21;
// I f you use final you can not change anything!!
public class Parent {
    final int noOfMonthsInYear=12;
   final void getMarry(){ //You can not override, it's final
       //noOfMonthsInYear=13;
        System.out.println("Marry Shakira");
    }
    void study(){
        System.out.println("Study medicine");
    }
}
class Axel extends Parent{
    final int noOfHoursInDay=24;
    @Override
    void study(){
        System.out.println(noOfMonthsInYear);
        System.out.println("No, I want SDET");
    }
}
