class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> seen = new HashSet<>();
        for (int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i]==nums2[j]){
                    seen.add(nums1[i]);
                }
            }
        }
        int[] arr = new int[seen.size()];
        int index = 0;
        for(int i : seen){
            arr[index++] = i;
        }
        return arr;
    }
}