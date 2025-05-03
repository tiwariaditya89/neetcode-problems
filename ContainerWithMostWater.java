public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int left = 0, right = height.length - 1;

        while (left < right) {

            int l = Math.min(height[left], height[right]);
            int w = right - left;
            int currentWater = l * w;
            maxWater = Math.max(maxWater, currentWater);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }

        }
        return maxWater;
    }

}
