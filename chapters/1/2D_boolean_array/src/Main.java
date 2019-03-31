public class Main {

    public static void main(String[] args) {
        boolean[][] input = new boolean[][]{
            { false, true, true, true, false },
            { true, false, true, false, true },
            { true, true, false, true, true },
            { true, false, true, false, true },
            { false, true, true, true, false },
        };

        for(int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                System.out.print(input[i][j] ? "*" : " ");
            }

            System.out.print("\n");
        }
    }
}
