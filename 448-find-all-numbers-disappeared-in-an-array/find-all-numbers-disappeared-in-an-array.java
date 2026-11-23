class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int num = 1;
        for(int j=0; j<nums.length; j++){
            if(nums[j]==num){
                num++;
            }
            else if(nums[j]>num){
                list.add(num);
                num++;
                j--;
            }
        }
        while(num<=nums.length){
            list.add(num);
            num++;
        }
        return list;
    }
}