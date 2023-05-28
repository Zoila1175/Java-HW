package GroupProject1;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        int number, i, count=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        number=scan.nextInt();
        for(i=2;i<number; i++){
            if(number%i==0){
                count++;
                break;
            }
        }
        if( count==0) {
            System.out.println(scan + " is a Prime Number");
        }else {
            System.out.println(scan+"  is not Prime Number");
        }


    }
}
