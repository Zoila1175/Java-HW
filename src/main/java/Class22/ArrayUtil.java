package Class22;

public interface ArrayUtil {
    //Search the array for the number if fount return true
    public boolean searchArr(int[]array,int number);
    double getAvg(double[]arr);
    int getCount(double[]arr,double number);
    int add(int num1, int num2);

}
class Main implements ArrayUtil {
    //Search the array for the number if found return true
    @Override
    public boolean searchArr(int[] arr, int num) {
        for (int j : arr) {
            if (j == num) {
                return true;
            }
        }
        return false;
    }

    @Override
    public double getAvg(double[] arr) {
        return 0;
    }

    @Override
    public int getCount(double[] arr, double number) {
        return 0;
    }

    @Override
    public int add(int num1, int num2) {
        return num1+num2;
    }

    /*Create a method to get the average of numbers from an array
     */
    public double getAvg(int[] arr) {
       double sum=0;
       for (int i=0; i< arr.length;i++){
           sum=sum+1;
       }
       return sum;
    }
}