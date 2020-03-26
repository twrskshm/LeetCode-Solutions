import java.util.HashSet;

public class SetMatrixZeroes {
    public static void setZeroes(final int[][] matrix) {
        HashSet<Integer> rows = new HashSet<>(), columns = new HashSet<Integer>();
        int numberOfRows = matrix.length, numberOfColumns = matrix[0].length;

        for (int row = 0; row < numberOfRows; row++)
            for (int column = 0; column < numberOfColumns; column++)
                if (matrix[row][column] == 0) {
                    rows.add(row);
                    columns.add(column);
                }

        for (int row = 0; row < numberOfRows; row++)
            for (int column = 0; column < numberOfColumns; column++)
                if (rows.contains(row) || columns.contains(column))
                    matrix[row][column] = 0;
    }
}
