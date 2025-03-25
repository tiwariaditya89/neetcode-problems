import java.util.*;

public class Test {
    public static void main(String[] args) {
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String, List<String>> anagramGroups = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            char[] charArr = str[i].toCharArray();
            Arrays.sort(charArr);

            String sorted = new String(charArr);
            if (!anagramGroups.containsKey(sorted)) {
                anagramGroups.put(sorted, new ArrayList<>());
            }
            anagramGroups.get(sorted).add(str[i]);
        }

        for (List<String> group : anagramGroups.values()) {
            System.out.println(group);
        }

    }
}
