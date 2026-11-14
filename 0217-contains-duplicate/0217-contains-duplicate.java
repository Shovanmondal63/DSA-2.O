class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer , Integer> Map = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++)
        {
            if(Map.containsKey(nums[i]))
            {
                return true;
            }
            Map.put(nums[i],i);
        }
        return false;
    }
}