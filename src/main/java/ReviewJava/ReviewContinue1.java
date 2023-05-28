package ReviewJava;

public class ReviewContinue1 {
    public static void main(String[] args) {
        System.out.println("What is the output????????");
        for (int i = 1; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i==2){
                    continue;
                }
            }
            System.out.println("Hello");

        }
        System.out.println("Bye");
    }
}
