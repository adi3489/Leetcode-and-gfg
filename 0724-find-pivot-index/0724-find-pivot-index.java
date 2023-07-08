class Solution {
    public int pivotIndex(int[] nums) {
       int lsum=0;
        int rsum=0;
        for(int i=0;i<nums.length;i++){
            lsum=lsum+nums[i];
         }
         for(int i=0;i<nums.length;i++){
             lsum=lsum-nums[i];

             if(rsum==lsum){
                 return i;
             }
             rsum=rsum+nums[i];
             
         }
         return -1;
    }
}