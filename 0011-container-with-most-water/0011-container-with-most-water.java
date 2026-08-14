class Solution {
    public int maxArea(int[] height) {
        int left,right,w,h,temp,max_w=0;
        left = 0;
        right = ((height.length) - 1);

        while(left < right)
        {
            w = (height[right-1] - height[left]);

            w = right - left;
            h = Math.min(height[left], height[right]);

            temp = (w * h);
            max_w = Math.max(temp,max_w);

            if(height[left] < height[right])
            {
                left ++ ;
            }

            else{
                right --;
            }
        }

        return max_w;
    }
}