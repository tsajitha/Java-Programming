import java.util.*;
import java.lang.*;
import java.io.*;
class Array
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int rows = 2, columns = 2;
        int[][] firstMatrix = { {2, 3}, {5, 2} };
        int[][] secondMatrix = { {-4, 5}, {5, 6} };

        // Adding Two matrices
        int[][] sum = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        // Displaying the result
        System.out.println("Sum of two matrices is: ");
        for(int[] row : sum) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
	}
}
