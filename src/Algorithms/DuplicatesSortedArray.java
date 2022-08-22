package Algorithms;

public class DuplicatesSortedArray {

    public int removeDuplicates(int[] nums) {
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]!=nums[i-1]) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        DuplicatesSortedArray sortedArray = new DuplicatesSortedArray();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(sortedArray.removeDuplicates(nums));
    }
}
