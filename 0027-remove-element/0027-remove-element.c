int removeElement(int* nums, int numsSize, int val) {
    int i,s=0;
    for(i=0;i<numsSize;i++)
    {
        if(nums[i] != val)
        {
            nums[s]=nums[i];
            s++;
        }
    }
    return s;
}