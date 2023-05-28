package Class15;

public class SyntaxEmployee {
    String empId;
    double salary;
    static String CEO="Sumair";

    public static void main(String[] args) {
        SyntaxEmployee ashgar=new SyntaxEmployee();
        ashgar.empId="123456";
        ashgar.salary=900000;
        System.out.println(ashgar.CEO); //not the preferred way
        System.out.println(SyntaxEmployee.CEO);//99.99 this is how they are used

        SyntaxEmployee sohail= new SyntaxEmployee();
        sohail.empId="584685";
        sohail.salary=92000;
        System.out.println(sohail.empId);
        System.out.println(ashgar.empId);

    }
}
