package Class8;

public class E5WhileAndBreak {
    public static void main(String[] args) {
        //Create a boolean variable summer store true in it then write a loop that runs as long as it is summer
        //Create a temp variable store 85 and inside the loop check if it is < 100 print "It's good I enjoy summer"
        //As soon as temp exceeds 100 print "It's very hot" and break the loop with break keyword.
        boolean summer= true;
        int temp=85;
                while (summer){
                    if(temp<100){
                        System.out.println("It's good I enjoy summer");

                    }else{
                        System.out.println("It's very hot");
                        break;
                    }
                    temp= temp+3;

                }
    }
}
