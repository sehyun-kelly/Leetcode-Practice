/* 278. First Bad Version - 52.58%, 59.96% */
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l = 1, r = n;
        int m = 0;

        while(l <= r){
            m = l + (r - l) / 2;

            if(isBadVersion(m)){
                r = m - 1;
            }else{
                l = m + 1;
            } 
        }

        return r + 1;
    }
}
