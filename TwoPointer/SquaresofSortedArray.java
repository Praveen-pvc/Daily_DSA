class Solution {
    public int[] sortedSquares(int[] nums) {
        int  l=0,
        r = nums.length-1;
        int res[] = new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            int val;
            if(Math.abs(nums[l]) > Math.abs(nums[r])){
                val = nums[l];
                l++;
            }
            else {
                val = nums[r];
                r--;
            }
          res[i] = val * val;
        }    
        return res;
}
}