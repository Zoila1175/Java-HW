package Class11;

public class E2D2Array {
    public static void main(String[] args) {
        String[][] names = {{"Sarah", "Artem", "Lean", "Samir"},
                {"Farwa", "Halina", "Alina", "Samir"}
        };
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.println(names[i][j]);
            }
        }
    }
}
