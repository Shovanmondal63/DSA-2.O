/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
    int i,j;
    for(i=0;i<numsSize;i++)
    {
        for(j=i+1;j<numsSize;j++)
        {
            if((nums[i]+nums[j]) == target)
            {
                nums[0]=i;
                nums[1]=j;
                *returnSize = 2;
                return nums;
                break;
            }
        }
    }
    return 0;
}