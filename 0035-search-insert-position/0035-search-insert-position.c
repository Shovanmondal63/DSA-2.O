int searchInsert(int* nums, int numsSize, int target) {
    int i,temp = -1 ;
    for (i=0;i<numsSize;i++)
    {
        if(target == nums[i])
        {
            temp=i;
        }
    }

    if(temp != -1)
    {
        return temp;
    }
    else{
        for(i=0;i<numsSize;i++)
        {
            if(nums[i] > target)
            {
                return i;
                break;
            }
            else if((i+1) == numsSize)
            {
                return i+1;
            }
        }
    }
    return 0;
}