int singleNumber(int* nums, int numsSize) {
    int i,count=0;
    for(i=0;i<numsSize;i++)
    {
        count=count ^ nums[i];
    }
    return count;
}