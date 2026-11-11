import java.util.*;

class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int count = 0;
        int ind = s.length() - 1;
        while(ind >= 0){
            if(s.charAt(ind) == ' ')
                return count;
            count++;
            ind--;
        }
        return count;
    }
}