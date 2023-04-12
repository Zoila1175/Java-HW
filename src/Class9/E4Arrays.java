package Class9;

public class E4Arrays {
    public static void main(String[] args) {
        String[] names = {"Sarah", "Zoila", "Adil", "Adrian", "Luis "};
        //              i         i       i       i         i
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);


        }
        int counter = 0;
        while (counter < names.length) {
            System.out.print(names[counter]+" ");
            counter++;

        }
    }
}