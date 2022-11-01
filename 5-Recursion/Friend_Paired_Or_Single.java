public class Friend_Paired_Or_Single {

    public static int pairOrSingle(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        // // choice
        // // singleway
        // int f1 = pairOrSingle(n - 1);

        // // pairs
        // int f2 = pairOrSingle(n - 2);
        // int pairWays = (n - 1) * f2;
        // int totalWays = f1 + pairWays;
        // return totalWays;

        return pairOrSingle(n - 1) + (n - 1) * pairOrSingle(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(pairOrSingle(10));
    }

}
