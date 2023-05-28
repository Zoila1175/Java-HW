package Class5;

import java.util.Scanner;
import java.util.SortedMap;

public class E8LogicalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you need a loan?");
        boolean loan = sc.nextBoolean();
        int score = 0;
        String eligibility = " ";
        if (loan == true) {
            System.out.println("What is your score?");
            score = sc.nextInt();
            if (score > 700 && score <= 800) {
                eligibility = " The eligibility is Eligible";
            }
            if (score >= 600 && score <= 700) {
                eligibility = " The eligibility is Maybe eligible";
            }
            if (score < 600) {
                eligibility = " The eligibility is Not eligible";
            }
            if (score > 800) {
                eligibility = "Eligibility Definitely eligible";
            }
            System.out.println(eligibility);
        } else {
            System.out.println("Unknown");
        }
    }
}
