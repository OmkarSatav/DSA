public class Shortest_Path {
    public static double getShortestPath(String str) {
        int i = 0;
        int x = 0, y = 0;
        while (str.length() - 1 >= i) {
            char dir = str.charAt(i);
            // North
            if (dir == 'N') {
                y++;
            }
            // West
            else if (dir == 'E') {
                x++;
            }
            // South
            else if (dir == 'S') {
                y--;
            }
            // East
            else {
                x--;
            }
            i++;
        }

        return Math.sqrt(y * y + x * x);
    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println("Shortest Path : " + getShortestPath(str));
    }
}
