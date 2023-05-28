package Review6;

public class Task8 {
    public static void main(String[] args) {
        //Print duplicates
        String[] baking={"spatula","weighing scale", "measuring cups","mixer","weighing scale", "pipping bags",
                "spatula","mixer","butter","buttercream","cake batter"};
        for(int i=0; i< baking.length; i++){
            for (int j=i+1; j<baking.length; j++){
                if(baking[i].equals(baking[j])){
                    System.out.println(baking[j]);
                }
            }
        }
    }
}
