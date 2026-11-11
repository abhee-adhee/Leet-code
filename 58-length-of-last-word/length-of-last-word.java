import java.util.*;

class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int ans = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                count++;
            } else if (count > 0) {
                list.add(count);
                count = 0;
            }
        }
        if (count > 0) {
            list.add(count);
        }
        int n = list.size();
        for (int i = 0; i < n; i++) {
            ans = list.get(i);
        }
        return ans;
    }
}