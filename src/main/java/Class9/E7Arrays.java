package Class9;

public class E7Arrays {
    public static void main(String[] args) {
        //Write a loop to count how many values there are below array are false
        boolean [] flags= {true, false, true, false, true,false};
        int counter=0;
        for (int i=0; i< flags.length; i++){
        if (flags[i]==false){
            counter++;
        }

        }
        System.out.println(counter);

    }
}
