import java.util.HashSet;

public class LongestSubstringWithouRepeatingCharacter {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> seen = new HashSet<>();
        if (s.length() == 0) {
            return 0;
        }

        int left = 0, right = 0;
        int ans = 1;
        while (right < s.length()) {
            if (!seen.contains(s.charAt(right))) {
                seen.add(s.charAt(right));
                ans = Math.max(ans, right - left + 1);
                right++;
            } else {
                seen.remove(s.charAt(left));
                left++;
            }
        }
        return ans;
    }
}
