public class Main {

    public static void main(String[] args) {
        if(args.length != 3) {
            System.out.print("args must contain three integers");
            return;
        }

        int[] input = new int[3];
        for(int i = 0; i < 3; i++) {
            input[i] = Integer.parseInt(args[i]);

            if(i > 0 && input[i] != input[i-1]) {
                System.out.print("not equal");
                return;
            }
        }

        System.out.print("equal");
        return;
    }
}
