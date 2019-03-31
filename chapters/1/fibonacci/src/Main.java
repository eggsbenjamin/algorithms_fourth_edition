public class Main {

    public static long oldF(int N) {
        if(N == 0) return 0;
        if(N == 1) return 1;
        return F(N-1)+F(N-2);
    }

    public static long F(int N) {
        if(N < 2) return N;

        int[] fibs = new int[N];
        fibs[0] = 1;
        fibs[1] = 1;

        for(int i = 2; i < N; i++)
            fibs[i] = fibs[i-1] + fibs[i-2];

        return fibs[N-1];
    }

    public static void main(String[] args) {
        TestCase[] testCases = new TestCase[] {
                new TestCase(0, 0),
                new TestCase(1, 1),
                new TestCase(2, 1),
                new TestCase(3, 2),
                new TestCase(4, 3),
                new TestCase(5, 5),
                new TestCase(6, 8),
                new TestCase(7, 13),
                new TestCase(8, 21),
                new TestCase(30, 832040),
        };

        for(int i = 0; i < testCases.length; i++) {
            System.out.println("running test case: " + i + "\n");

            long actual = F(testCases[i].input);
            assert actual == testCases[i].expected : String.format("fib %d != %d. Actual %d", testCases[i].input, testCases[i].expected, actual);
        }
    }
}

class TestCase {
    int input;
    int expected;

    TestCase(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }
}
