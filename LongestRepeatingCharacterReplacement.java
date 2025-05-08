import java.util.Arrays;

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int[] characterCount = new int[26];
        Arrays.fill(characterCount,0);
        int maxLength = 0;
        int maxFrequecy = 0;
        int left =0,right = 0;
        while(right<s.length()){
            char currentChar = s.charAt(right);
            characterCount[currentChar - 'A']++;
            maxFrequecy = Math.max(maxFrequecy,characterCount[currentChar - 'A']);
            if((right-left+1 - maxFrequecy) > k){
                characterCount[s.charAt(left)-'A']--;
                left++;
            }
            maxLength = Math.max(maxLength,right-left+1);
            right++;

        }
        return maxLength;
    }
}
