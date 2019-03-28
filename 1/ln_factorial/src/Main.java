public class Main {

    public static long factorial(int N) {
        if(N <= 2) return N;

        long result = 1;
        for(int i = 2; i <= N; i++)
            result *= i;

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Running factorial tests");

        TestCaseFactorial[] testCasesLn = new TestCaseFactorial[] {
                new TestCaseFactorial(0, 0),
                new TestCaseFactorial(1, 1),
                new TestCaseFactorial(2, 2),
                new TestCaseFactorial(3, 6),
                new TestCaseFactorial(4, 24),
        };

        for(int i = 0; i < testCasesLn.length; i++) {
            long actual = factorial(testCasesLn[i].input);
            assert actual == testCasesLn[i].expected : String.format("ln: %d != %d. Input %d", actual, testCasesLn[i].expected, testCasesLn[i].input);
        }

        // TODO: write function for natural logarithms...
        System.out.println(Math.log(factorial(2)));
    }
}

class TestCaseFactorial {
    int  input;
    long expected;

    TestCaseFactorial(int input, long expected) {
        this.input = input;
        this.expected = expected;
    }
}
