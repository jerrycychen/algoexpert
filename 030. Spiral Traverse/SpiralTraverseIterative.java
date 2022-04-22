import java.util.*;

class Program {
    // O(n) time | O(n) space - where n is the total number of elements in the array
    public static List<Integer> spiralTraverse(int[][] array) {
        if (array.length == 0)
            return new List<Integer>();

        var result = new List<Integer>();
        var startRow = 0;
        var endRow = array.length - 1;
        var startCol = 0;
        var endCol = array[0].length - 1;

        while (startRow <= endRow && startCol <= end) {
            for (int col = startCol; col <= endCol; col++) {
                result.add(array[startRow][col]);
            }
            for (int row = startRow + 1; row <= endRow; row++) {
                result.add(array[row][endCol]);
            }
            for (int col = endCol - 1; col >= startCol; col--) {
                // Handle the edge case when there's a single row
                // in the middle of the matrix. In this case) we don't
                // want to double-count the values in this row, which
                // we've already counted in the first for loop above.
                // See Test Case 8 for an example of this edge case.
                if (startRow == endRow) {
                    break;
                }
                result.add(array[endRow][col]);
            }
            for (int row = endRow - 1; row > startRow; row--) {
                // Handle the edge case when there's a single column
                // in the middle of the matrix. In this case, we don't
                // want to double-count the values in this column, which
                // we've already counted in the second for loop above.
                // See Test Case 9 for an example of this edge case.
                if (startCol == endCol) {
                    break;
                }
                result.add(array[row][startCol]);
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        return result;
    }
}