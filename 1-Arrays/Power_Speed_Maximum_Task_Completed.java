public class Power_Speed_Maximum_Task_Completed {

    public static int maximumTask(int A[], int B[], int C[]) {
        int n = A.length;
        int executed[] = new int[n];
        int maxTask = 0;
        int power = 1, speed = 1;

        int time = 0;
        while (true) {
            int min = Integer.MAX_VALUE;
            int getPower = 0;
          
            for (int i = 0; i < n; i++) {
                if (A[i] <= power && executed[i] == 0 && B[i] <= speed) {
                    min = i;
                    getPower = C[i];
                }
            }

            if (getPower == 0) {
                return maxTask;
            }

            executed[min] = 1;
            maxTask++;
            power += getPower;
            speed += getPower;

        }
    }

    public static void main(String[] args) throws Exception {
        int A[] = { 1, 2, 4, 9 };
        int B[] = { 1, 2, 4, 9 };
        int C[] = { 2, 1, 2, 3 };
        System.out.println(maximumTask(A, B, C));  // 3
    }
}


// You are playing a video game. Your character has two properties Power and Speed. Initially, your character has 1 power and 1 speed.
// Given N tasks in the game which need to be performed in any order. However. the ith task requires a minimum of A[i] power or B[i] speed.
// On completing the ith task you get C[i] points which you can use to increase power and speed. 1 point can be redeemed to increase 1 power or 1 speed.
// Find the maximum number of tasks that you can complete.
