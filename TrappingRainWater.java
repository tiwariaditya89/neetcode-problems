public class TrappingRainWater {
    public int trap(int[] height) {

        int left = 0, right = height.length - 1;
        int leftMax = height[left], rightMax = height[right];

        int totalWater = 0;

        while (left < right) {
            int currentWater = 0;
            if (height[left] < height[right]) {

                leftMax = Math.max(leftMax, height[left]);
                currentWater = leftMax - height[left];
                totalWater += currentWater;
                left++;
            } else {
                rightMax = Math.max(rightMax, height[right]);
                currentWater = rightMax - height[right];
                totalWater += currentWater;
                right--;
            }

        }
        return totalWater;
    }
}
