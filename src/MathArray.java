/**
 *
 * @author pumpy
 */
public class MathArray {

    private int[][] table;
    private int[] row;

    public MathArray(int[][] table, int[] row) {
        setTable(table);
        setRow(row);
    }

    public void setTable(int[][] table) {
        this.table = new int[table.length][table.length];
        if (table != new int[][]{}) {
            for (int i = 0; i < table.length; i++) {
                for (int j = 0; j < table[i].length; j++) {
                    this.table[i][j] = table[i][j];
                }
            }
        } else {
            table = new int[][]{};
        }
    }

    public void setRow(int[] row) {
        this.row = new int[row.length];
        if (row != new int[]{}) {
            for (int i = 0; i < row.length; i++) {
                this.row[i] = row[i];
            }
        } else {
            row = new int[]{};
        }
    }

    public int[][] getTable() {
        int[][] retTable = new int[table.length][table.length];
        for (int i = 0; i < retTable.length; i++) {
            retTable[i] = table[i];
        }
        return retTable;
    }

    public int[] getRow() {
        int[] rRow = new int[row.length];
        for (int i = 0; i < rRow.length; i++) {
            rRow[i] = row[i];
        }
        return rRow;
    }

    public String toString() {
        String strTable = "";
        String strRow = "";

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                strTable += table[i][j] + ", ";
                if(((j+1) % table.length) == 0) {
                strTable += "\n";
                }
            }
        }

        for (int i = 0; i < row.length; i++) {
            strRow += row[i] + ", ";
        }

        strTable = strTable.substring(0, strTable.lastIndexOf(","));
        strRow = strRow.substring(0, strRow.lastIndexOf(","));

        return String.format("Elementi table\n%s\nElementi row: %s",
                strTable, strRow);
    }

    public int maxTableElement() {
        int maxTableElement = table[0][0];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j] > maxTableElement) {
                    maxTableElement = table[i][j];
                }
            }
        }
        return maxTableElement;
    }

    public double rowLength() {
        double scalar = 0;
        double result = 0;
        for (int i = 0; i < getRow().length; i++) {
            scalar += getRow()[i] * getRow()[i];
        }
        result = Math.sqrt(scalar);
        result = Math.round(result * 100);
        result = result / 100;
        return result;
    }

    public double averageByRow() {
        int sum = 0;
        double result = 0;
        for (int i = 0; i < getRow().length; i++) {
            sum += getRow()[i];
        }
        result = (double) (sum) / (getRow().length);
        return result;
    }

    public int[] sortRow() {
        for (int i = 0; i < row.length - 1; i++) {
            for (int j = 0; j < row.length - 1; j++) {
                if (row[j] > row[j + 1]) {
                    int temp = row[j];
                    row[j] = row[j + 1];
                    row[j + 1] = temp;
                }
            }
        }
        return row;
    }
    public static int[][] transpose(int[][] matrix) {
        int transposed[][] = new int[matrix.length][matrix.length];
        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[i].length; j++) {
                transposed[i][j] = matrix[j][i];
            }
        }
        return transposed;
    }

}
