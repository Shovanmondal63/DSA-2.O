class Solution {
    public void sortColors(int[] nums) {
        int val1,val2,val3;
        val1=val2=val3=0;
        for(int i=0 ; i<nums.length ; i++)
        {
            if(nums[i] == 0) val1 += 1;
            else if(nums[i] == 1) val2 += 1;
            else val3 += 1;
        }

        for(int i=0 ; i<nums.length ; i++)
        {
            if(i<val1) nums[i] = 0;

            else if(i<val2 + val1) nums[i] = 1;
            else nums[i] = 2;
        }
    }
}