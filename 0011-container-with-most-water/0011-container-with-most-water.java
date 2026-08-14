class Solution {
    public int maxArea(int[] height) {
        int left = 0; 
        int right = ((height.length) - 1);
        int max_water = 0;
        int h ;
        int temp;
        while(left < right)
        {
            int w = (right - left);
            h = Math.min(height[left], height[right]);

            temp = (w * h);

            if(max_water < temp)
            {
                max_water = temp;
            }

            if(height[left] < height[right])
            {
                left++ ;
            }
            else{
                right--;
            }
        }

        return max_water;
    }
}