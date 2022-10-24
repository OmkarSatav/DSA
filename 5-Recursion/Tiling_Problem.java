public class Tiling_Problem {
    public static int tilingSolution(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int singleway = tilingSolution(n - 1);
        int doubleway = tilingSolution(n - 2);
        int solution = singleway + doubleway;
        return solution;
    }

    public static int pairOrSingle(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        return pairOrSingle(n - 1) + (n - 1) * pairOrSingle(n - 2);
    }

    public static void main(String[] args) {
        // System.out.println(tilingSolution(4));

        System.out.println(pairOrSingle(10));
    }

}
