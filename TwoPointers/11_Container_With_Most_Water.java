/** 84.60%, 88.71% */
class Solution {
    public int maxArea(int[] height) {
        if(height.length == 2) return Math.min(height[0], height[1]);

        int left = 0, right = height.length - 1;
        int water = 0;

        while(left <= right) {
            int leftHeight = height[left];
            int rightHeight = height[right];

            int temp = (right - left) * Math.min(leftHeight, rightHeight);
            water = temp > water ? temp : water;

            if(leftHeight >= rightHeight) right--;
            else left++;
        }

        return water;
    }
}