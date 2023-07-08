class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low=0;
         int high=nums.length-1;
        int firstindex=-1;
        
        

        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                firstindex=mid;
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
    
         low = 0;
          high = nums.length -1;
         int lastindex=-1;

         while(low <= high){
              int mid=(low+high)/2;
             if(nums[mid]==target){
                 lastindex=mid;
                 low=mid+1;
             }
             else if(nums[mid]<target){
                 low=mid+1;
             }
             else{
                 high=mid-1;
             }
         }
         int ans[]={firstindex,lastindex};
         return ans;



    }
}