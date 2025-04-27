import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 0, 1, 2,100,101,102,103,104};
        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
        int result = longestConsecutiveSequence.longestConsecutive(nums);
        System.out.println("Result: " + result);

    }

    public int longestConsecutive(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        int lcs = 0;
        HashSet<Integer> set = new HashSet<>();
        for (Integer i : nums) {
            set.add(i);
        }

        for (Integer num : set) {
            if (!set.contains(num - 1)) {
                int currentElement = num;
                int currentStrike = 1;
                while (set.contains(currentElement + 1)) {
                    currentStrike++;
                    currentElement++;
                }
                lcs = Math.max(currentStrike, lcs);
            }
        }
        return lcs;
    }
}
