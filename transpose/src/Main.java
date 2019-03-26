public class Main {

    public static int[][] transpose(int[][] input) {
        int[][] output = new int[input.length][input[0].length];

        // what does this function do?
        //  returns a new 2d array with the rows and columns swapped
        // [0][1] == [1][0]
        // [0][2] == [2][0]

        for(int i = 0; i < input.length; i++)
            for(int j = 0; j < input.length; j++)
                output[j][i] = input[i][j];

        return output;
    }

    public static void main(String[] args) {
        int[][] input = new int[][] {
                {5, 4, 3},
                {4, 0, 4},
                {7, 10, 3},

        };

        int[][] transposed = transpose(input);

        for(int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed.length; j++)
                System.out.print(transposed[i][j]);

            System.out.print("\n");
        }
    }
}
