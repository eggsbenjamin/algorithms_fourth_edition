public class Main {

    public static long factorial(int N) {
        if(N <= 1) return N;

        return N * factorial(N-1);
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
            System.out.println(testCasesLn[i].input + " == " + testCasesLn[i].expected + "\n");

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
