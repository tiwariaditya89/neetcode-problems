import java.util.*;

public class GroupAnagram {

        public List<List<String>> groupAnagrams(String[] strs) {

            Map<String, List<String>> anagramGroups = new HashMap<>();

            for (String s : strs) {
                char[] charArr = s.toCharArray();
                Arrays.sort(charArr);
                String sorted = new String(charArr);

                // If the sorted key is not present, add it with an empty list
                if (!anagramGroups.containsKey(sorted)) {
                    anagramGroups.put(sorted, new ArrayList<>());
                }

                // Add the original word to the corresponding group
                anagramGroups.get(sorted).add(s);
            }

            return new ArrayList<>(anagramGroups.values());

        }
}
