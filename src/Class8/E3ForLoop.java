package Class8;

public class E3ForLoop {
    public static void main(String[] args) {
        //Write a loop to add all the even numbers from 1 to 30
       int sum=0;
        for (int i= 1; i<=30; i++){
           if (i%2==0){
               sum=sum+i;
           }
       }
        System.out.println(sum);
    }
}
