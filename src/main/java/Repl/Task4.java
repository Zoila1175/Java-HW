package Repl;

public class Task4 {
    public static void main(String[] args) {
        String [] cars= {"Toyota", "Honda"," Bugatti", " Audi","Mercedes"};
        for (String car: cars){
            System.out.println(car+" " );
        }
        for (int i= 0; i< cars.length; i++){
            System.out.println(cars[i]+ " ");
        }
        int i=0;
        while ( i< cars.length){
            System.out.println(cars [i] + " ");
            i++;
        }
    }
}
