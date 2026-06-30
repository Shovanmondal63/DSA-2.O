int removeDuplicates(int* nums, int numsSize) {
    int x=0,i;
    for(int i=1 ; i<numsSize ; i++)
    {
        if(nums[i] != nums[x])
        {
            x++;
            nums[x] = nums[i];
        }
    }
    return x+1;
}