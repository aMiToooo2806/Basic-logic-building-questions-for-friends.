package Array;


// Transpose meanse converting rows of 2d array to coloumns.
public class TransposeMetrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},  // Row 0
                {4, 5, 6},  // Row 1
                {7, 8, 9}   // Row 2
        };
                //expected output
//                1 4 7
//                2 5 8
//                3 6 9

        for(int i = 0; i<matrix.length; i++)
        {
            for(int j = 0; j<matrix[0].length; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        for(int i = 0; i < matrix.length; i++) {
            // This ensures we only swap each pair once and ignore the diagonal
            for(int j = i + 1; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //System.out.println(Arrays.deepToString(matrix));
        System.out.println();
        System.out.println();
        for(int i = 0; i<matrix.length; i++)
        {
            for(int j = 0; j<matrix[0].length; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}

