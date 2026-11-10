class Solution {
    public int majorityElement(int[] nums) {
    Map <Integer , Integer > map = new HashMap<>();
    int max=Integer.MIN_VALUE;
    for (int i=0;i<nums.length ; i++){
        if(!map.containsKey(nums[i]))
            map.put(nums[i],1);
        else
            map.put(nums[i],map.get(nums[i])+1);
    }
    int key = 0;
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                key = entry.getKey();
            }
        }
        return key;
    }
}