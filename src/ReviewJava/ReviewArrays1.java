package ReviewJava;

import com.sun.source.tree.EnhancedForLoopTree;

public class ReviewArrays1 {
    public static void main(String[] args) {
        String[]planets={"Earth", "Mars", "Jupiter", "Saturn"," Neptune"};


        for(int i=0; i< planets.length; i++){
            System.out.print("   Enhanced For Loop   ");
            for(String planet: planets){
                System.out.println(planet);
        }
    }
    }
}
