import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeString {
    public String encode(String[] strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length());
            sb.append("#");
            sb.append(s);
        }
        return sb.toString();
    }

    public String[] decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            result.add(str.substring(i, length + i));
            i = length + i;
        }
        return result.toArray(new String[0]);
    }
}
