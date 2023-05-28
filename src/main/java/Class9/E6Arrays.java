package Class9;

public class E6Arrays {
    public static void main(String[] args) {
        /* Create an array store 10,50,60,45,100 then print elements which are present on odd indexes
        */
        int []numbers={ 10,50,60,45,100};
        //  i=          0   1  2  3   4
        for (int i=0; i<numbers.length; i++){
            if (i%2==1){    //here starts w/ 1 because we need odd numbers
                System.out.println(numbers[i]);
            }
        }
    }
}