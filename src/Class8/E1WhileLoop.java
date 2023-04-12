package Class8;

import java.util.Scanner;

public class E1WhileLoop {
    public static void main(String[] args) {
        //Print all numbers from a starting point to an ending point, ask user for starting and ending point
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the starting and the ending point");
        int start=scan.nextInt();
        int end= scan.nextInt();
        int counter=start;
        while (counter<=end){
            System.out.print(counter +" ");
            counter ++;

        }
    }
}
