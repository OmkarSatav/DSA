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

    public static void main(String[] args) {
        System.out.println(tilingSolution(4));
    }

}
