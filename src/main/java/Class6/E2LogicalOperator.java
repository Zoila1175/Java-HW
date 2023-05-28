package Class6;

public class E2LogicalOperator {
    public static void main(String[] args) {
//Both need to be true=true, true+ false= false
        double marksInMath=82;
        double marksInScience=95;
        if (marksInMath>90 && marksInScience>90){
            System.out.println("You are a brilliant student");
        }else{
            System.out.println("You need to work hard");
        }

    }
}


