import java.util.Arrays;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        // Increment character count for s and decrement for t
        s.chars().forEach(ch -> count[ch - 'a']++);
        t.chars().forEach(ch -> count[ch - 'a']--);

        // Check if all values in count array are zero
        return Arrays.stream(count).allMatch(c -> c == 0);
    }

}
