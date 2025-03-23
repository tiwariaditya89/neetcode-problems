import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int temp = target - nums[i]; // x + y = target => y = target - x

            if (map.containsKey(temp)) {
                return new int[] { map.get(temp), i };
            }

            map.put(nums[i], i);

        }
        return new int[] {};
    }
}
