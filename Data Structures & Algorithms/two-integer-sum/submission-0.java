class Solution {
    public int[] twoSum(int[] nums, int target) {
        // HasMap  for  maintain  or  store  index + value
        int  ans [] = new int[2];
        HashMap<Integer,Integer> map = new  HashMap<>();

        for(int i=0;i<nums.length;i++){
            int  dif = target - nums[i];
            
            if(map.containsKey(dif)){
                ans[0] = map.get(dif);
                ans[1] = i;
                break;
            }

            map.put(nums[i],i);
        }

        return ans;
    }
}
