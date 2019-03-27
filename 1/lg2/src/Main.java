public class Main {

    public static int lg(int N) {
       // what does this function do?
       // returns the largest int not larger than the base-2 logarithm of N

        if(N < 0) return -1; // undefined
        if(N < 2) return 0;

        int current = 1;
        int exp = 0;
        while(current < N) {
            current *= 2;
            ++exp;
        }

        return (current == N) ? exp : --exp;
    }

    public static void main(String[] args) {
        System.out.print(lg(5));
    }
}
