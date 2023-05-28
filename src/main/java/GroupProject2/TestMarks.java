package GroupProject2;

import jdk.jfr.Percentage;

public class TestMarks {
    public static void main(String[] args) {
        A studentA = new A(80, 70, 90);
        System.out.println("Percentage obtained by student A: " + studentA.getPercentage() + "%");

        B studentB = new B(85, 75, 95, 80);
        System.out.println("Percentage obtained by student B: " + studentB.getPercentage() + "%");
    }

}