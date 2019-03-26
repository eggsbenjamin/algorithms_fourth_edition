public class Main {

    public static void main(String[] args) {
        if(args.length < 1) {
            System.out.print("an integer argument is required");
            return;
        }

        int dec = Integer.parseInt(args[0]);
        String binaryStr = "";
        do {
            binaryStr = dec%2 + binaryStr;
            dec /= 2;
        } while(dec != 0);

        System.out.print("binary representation of " + args[0] + " = " + binaryStr + "\n");
    }
}
