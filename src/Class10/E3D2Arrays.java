package Class10;

public class E3D2Arrays {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30},//0 <-- row
                {20, 50, 65},//1
                {102, 54, 60},//2
        };     //0    1   2 ^ column
        int[] arr1 = matrix[0];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        arr1 = matrix[1];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        arr1 = matrix[2];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}