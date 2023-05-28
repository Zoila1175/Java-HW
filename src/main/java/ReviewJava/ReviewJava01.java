package ReviewJava;

public class ReviewJava01 {
    public static void main(String[] args) {
        //Logical Operators
        boolean loginButtonDisplayed= true;
        boolean loginClickable= true;
        if ( loginButtonDisplayed &&  loginClickable){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }
        System.out.println(" ________LOGICAL OR ______________");
    boolean pictureDisplayed= true;
    String accountName= "Syntax";
    if (pictureDisplayed|| accountName.equals("Syntax))")){

        }else {
            System.out.println("User was not able to login");
    }
        System.out.println(" ______LOGICAL NOT___________");

    boolean hungry= !true;
        System.out.println(hungry);

        boolean cold= false;
        System.out.println(!cold);
        String str= "Hello";
        }
}
