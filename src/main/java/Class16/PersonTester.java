package Class16;

public class PersonTester {
    public static void main(String[] args) {
        Person person=new Person();
        //person.password="12345"; // because it's private it would not print
        //person.printPassword();
        //Person.printBalance(); will not work
        System.out.println(person.SSN);
        System.out.println(person.name);
         }

}
