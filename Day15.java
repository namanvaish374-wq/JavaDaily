/* 
Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
*/

class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,zerocount=0,max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            zerocount++;
            while(zerocount >k ){
                if(nums[l]==0)
                zerocount--;
                l++;
            }
            max=Math.max(max,i-l+1);
        }
        return max;
    }
}