import java.util.Random;

public class JavaApplication {

    public static void main(String[] args) {

        Random rand = new Random();
        int[][] myTable = new int[4][4];
        int[] myRow = new int[5];

        for (int i = 0; i < myTable.length; i++) {
            for (int j = 0; j < myTable[i].length; j++) {
                myTable[i][j] = 10 + rand.nextInt(31);
            }
        }

        for (int i = 0; i < myRow.length; i++) {
            myRow[i] = 5 + rand.nextInt(11);
        }

        MathArray mathArray = new MathArray(myTable, myRow);

        System.out.println(mathArray.toString());

        System.out.println("Max table element is: "
                + mathArray.maxTableElement());

        System.out.println("Row length is: " + mathArray.rowLength());

        System.out.println("Average by row: " + mathArray.averageByRow());

        System.out.print("Sorted row: ");
        myRow = mathArray.sortRow();

        for (int i = 0; i < myRow.length; i++) {
            System.out.print(myRow[i] + " ");
        }

        System.out.println("");

        System.out.println("Transposed matrix: ");
        int[][] transposed = MathArray.transpose(myTable);
        
        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[i].length; j++) {
                System.out.print(transposed[i][j] + " ");
                if ((j) % (transposed.length - 1) == 0 && j != 0) {
                    System.out.println("");
                }
            }
        }
    }
}
