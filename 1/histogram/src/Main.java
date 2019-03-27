import java.util.Arrays;

public class Main {

    public static int[] histogram(int[] a, int M) {
        // what does this method do?
        // returns an array of length M whose ith entry is the number of times the integer i
        // appears in the array a.

        int [] out = new int[M];
        for(int i = 0; i < a.length; i++)
            out[a[i]-1]++;

        return out;
    }

    public static void main(String[] args) {
        TestCase[] testCases = new TestCase[] {
                new TestCase(new int[]{}, 0, new int[]{}),
                new TestCase(new int[]{1}, 1, new int[]{1}),
                new TestCase(new int[]{2}, 2, new int[]{0,1}),
                new TestCase(new int[]{10}, 10, new int[]{0,0,0,0,0,0,0,0,0,1}),
        };

        for(int i = 0; i < testCases.length; i++) {
            System.out.print("running test case " + i + "\n");
            int[] result =  histogram(testCases[i].input, testCases[i].M);

            int resultSum = 0;
            for(int j = 0; j < result.length; j++)
                resultSum += result[j];

            assert Arrays.equals(result, testCases[i].expected) : String.format("actual != expected result for test case %d : %s %s", i, Arrays.toString(testCases[i].expected), Arrays.toString(result));
            assert resultSum == testCases[i].input.length : String.format("sum (%d) doesn't match input length (%d) for test case %d", resultSum, testCases[i].input.length, i);
        }
    }
}

class TestCase {
    int M;
    int[] input;
    int[] expected;

    public TestCase(int[] input, int M, int[] expected) {
        this.input = input;
        this.M = M;
        this.expected = expected;
    }
}
