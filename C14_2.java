package cla;

public class C14_2 {
    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        int left=0,right=nums.length-1,mid;
        while(left<right){
            mid=(left+right)/2;
            if(mid==left){
                break;
            }
            if(target>nums[mid]){
                left=mid;
            }else if(target<nums[mid]){
                right=mid;
            }else{
                if(mid==0){
                    return 0;
                }else{
                    if(nums[mid]==nums[mid-1]){
                        right=mid;
                    }else{
                        return mid;
                    }
                }
            }
        }
        if(target==nums[left]){
            return left;
        }
        return -1;
    }
}
