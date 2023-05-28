package Class14;

public class E7 {
    /*Create a method that will take
     2 parameters as a numbers print
      which number is larger*/
    void printLarge(int num1, int num2){
        if (num1>num2){
            System.out.println(num1);
        }else{
            System.out.println(num2);
        }
    }

    public static void main(String[] args) {
        E7 e7= new E7();
        e7.printLarge(10,30);

    }

}
