package Algorithms;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {

        int arrayUniqueSize = 0;

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums [i+1] ) {
                nums = remove(nums, i+1);
            } else if ((i>0 && nums[i] == nums[i-1])) {
                i--;
                nums = remove(nums, i+1);
            }
        }
        return arrayUniqueSize;
    }


    private int[] remove(int[]nums, int k) {
        for (int j = k; j<nums.length-1; j++) {
            nums[j] = nums[j+1];
        }
        return nums;
    }
}
