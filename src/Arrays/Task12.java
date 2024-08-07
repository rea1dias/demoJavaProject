package Arrays;

public class Task12 {

    public static void main(String[] args) {

        int array[][] = new int[7][9];

        // 0 1 2
        // 1 0 0
        // 2 2 0
        // 3 0 0

        array[6][2] = 5;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


    }
}
