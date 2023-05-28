package ReviewJava;

import java.util.Scanner;

public class ArrayScanner {
    public static void main(String[] args) {
        /*Create an array to store numbers from a user and then we want to
        calculate the average of numbers
         */
        Scanner scanner= new Scanner(System.in);
        System.out.println("How many integers you want to store");
        int size= scanner.nextInt();
        int[] numbers=new int[size];
        for(int i=0; i< size; i++){
            System.out.println("Please enter "+ (i+1)+" element");
            numbers[i]= scanner.nextInt();
        }
    }
}
