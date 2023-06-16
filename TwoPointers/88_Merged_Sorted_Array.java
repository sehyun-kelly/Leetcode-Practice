/** My Solution - 100%, 62.39% */

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m == 0 && n == 1) nums1[0] = nums2[0];

        int ptr1 = m - 1;
        int ptr2 = n - 1;
        int index = nums1.length - 1;

        while(ptr1 >= 0 && ptr2 >= 0 && index >= 0){
            if(nums1[ptr1] >= nums2[ptr2]){
                nums1[index] = nums1[ptr1];
                ptr1--;
            }else{
                nums1[index] = nums2[ptr2];
                ptr2--;
            }
            index--;
        }

        if(ptr1 < 0 && ptr2 >= 0){
            for(int i = ptr2; i >= 0; i--){
                nums1[index] = nums2[i];
                index--;
            }
        }
    }
}
