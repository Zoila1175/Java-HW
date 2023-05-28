package ReviewJava;

public class ReviewArrays {
    public static void main(String[] args) {
        int a=10;
        int[]arr=new int[3];
        //We store elements based on indexes
        arr[0]=10;
        arr[1]=11;
       // arr[2]=12;

        // access also by indexes
        System.out.println(arr[1]);

        String[]planets={"Earth", "Mars", "Jupiter", "Saturn"," Neptune"};

       // System.out.println(planets[0]);
       // System.out.println(planets[1]);
       // System.out.println(planets[2]);

        for(int i=0; i< planets.length; i++){
            System.out.print(planets[i]+ " ");
        }
    }
}
