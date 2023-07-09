class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        int y=0;
        int x=0;
        for(int i=0;i<nums.length;i++){
            xor=xor^nums[i];
        }
        int SetBit=xor & ~(xor-1);
        for(int i=0;i<nums.length;i++){
            if((nums[i] & SetBit)!=0){
                x=x^nums[i];
            }else{
                y=y^nums[i];
            }
        }
        return new int[]{x,y};
        
    }
}