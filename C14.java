package cla;

public class C14 {
    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        return search(nums,target,0,nums.length-1);
    }
    int search(int[] nums,int target,int left,int right){
        if(left==right){
            if(target==nums[left]){
                return left;
            }else{
                return -1;
            }
        }else{
            if(target==nums[(right+left)/2]){
                return (right+left)/2;
            }else{
                if(target>nums[(right+left)/2]){
                    return search(nums,target,(right+left)/2,right);
                }else{
                    if(target<nums[(right+left)/2]){
                        return search(nums,target,left,(right+left)/2);
                    }
                }
            }
        }
        return -1;
    }
}
