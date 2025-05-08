import java.util.Arrays;

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {

        int[] characterCountS1 = new int[26];
        int[] characterCountS2 = new int[26];

        Arrays.fill(characterCountS1, 0);
        Arrays.fill(characterCountS2, 0);

        for (int i = 0; i < s1.length(); i++) {
            characterCountS1[s1.charAt(i) - 'a']++;
        }

        int left = 0, right = 0;

        while (right < s2.length()) {
            characterCountS2[s2.charAt(right) - 'a']++;
            if ((right - left + 1) > s1.length()) {
                characterCountS2[s2.charAt(left) - 'a']--;
                left++;
            }
            if ((right - left + 1) == s1.length()) {
                if (Arrays.equals(characterCountS1, characterCountS2)) {
                    return true;
                }
            }
            right++;
        }
        return false;
    }
}
