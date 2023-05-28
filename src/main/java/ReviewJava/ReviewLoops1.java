package ReviewJava;

public class ReviewLoops1 {
    public static void main(String[] args) {
        for (int a = 8; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                for (int c = 0; c <= 9; c++) {
                    System.out.println(a + " " + b + " " + c);
                }
            }
        }

        System.out.println("What is the output????????");
        for(int i=1; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.println("Hello");
            }
            System.out.println("Bye");
            break;
        }
    }

}

