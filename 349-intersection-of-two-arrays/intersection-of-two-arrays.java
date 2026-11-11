class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean[] seen = new boolean[1001];

        for(int num:nums1){
            seen[num] = true;
        }

        int[] result = new int[1001];
        int index = 0;

        for(int num: nums2){
            if(seen[num]){
                result[index++] = num;

                seen[num] = false;
            }
        }

        return Arrays.copyOf(result, index);
    }
}