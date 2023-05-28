package Class10;

public class E4D2Arrays {
    public static void main(String[] args) {
        /* When ever we replace code we should replace it w/ a loop*/
        int[][] matrix = {
                {10, 20, 30},//0 <-- row
                {20, 50, 65},//1
                {102, 54, 60},//2
        };     //0    1   2 ^ column
        for (int j = 0; j < 3; j++) {
            //getting the complete oneD array from 2D array
            int[] arr1 = matrix[j];
            for (int i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i] + " ");
            }
            System.out.println();
        }
    }
}
