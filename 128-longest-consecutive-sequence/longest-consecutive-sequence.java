class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Set<Integer> unique = new HashSet<>();
        for(int num : nums){
            unique.add(num);
        }
        int maxlen=0;
        for (int num : unique ){
            if(!unique.contains(num-1)){
                int curr = 1;
                while(unique.contains(num+1)){
                    num++;
                    curr++;
                }
                maxlen = Math.max(maxlen , curr);
            }
        }
        return maxlen;
     }
}