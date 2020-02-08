package cla;

public class C585 {
    /**
     * @param nums: a mountain sequence which increase firstly and then decrease
     * @return: then mountain top
     */
    public int mountainSequence(int[] nums) {
        // write your code here
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[i+1]){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}
