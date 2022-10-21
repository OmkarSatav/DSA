public class Trapped_Water {
    public static void trappedWaterCount(int height[]) {
        int len = height.length;

        int leftMax[] = new int[len];
        leftMax[0] = height[0];

        for (int i = 1; i < len; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        int rightMax[] = new int[len];
        rightMax[len - 1] = height[len - 1];

        for (int i = len - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int trappedWater = 0;
        for (int i = 0; i < len; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }

        System.out.println("Total Water trapped in blocks is : " + trappedWater);
    }

    // Another method to calculate Trapped Water
     public static int trappedWater2(int arr[]) {
        int l = 0;
        int r = arr.length - 1;
        int leftM = arr[0];
        int rightM = arr[arr.length - 1];
        int waterTrapped = 0;
        while (l < r) {
            if (leftM < rightM) {
                l++;
                leftM = Math.max(arr[l], leftM);
                waterTrapped += leftM - arr[l];
            } else {
                r--;
                rightM = Math.max(arr[r], rightM);
                waterTrapped += rightM - arr[r];
            }
        }
        return waterTrapped;
    }
    
    
    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };

        trappedWaterCount(height);
    }
}
