class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int temp = ((n*(n + 1)) / 2);
        int flag=0;
        for(int i=0 ; i<nums.length ; i++)
        {
            flag += nums[i];
        }
        return temp - flag;
    }
}