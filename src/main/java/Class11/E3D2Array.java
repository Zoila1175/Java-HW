package Class11;

public class E3D2Array {
    public static void main(String[] args) {
        String[][] names2DArray = {{"Sarah", "Artem", "Lean", "Samir"},
                {"Farwa", "Halina", "Alina", "Samir"}
        };
        for (String[] name1DArr : names2DArray) {
            for (String name : name1DArr) {
                System.out.print(name + " ");
            }
            System.out.println();
        }
    }    }

