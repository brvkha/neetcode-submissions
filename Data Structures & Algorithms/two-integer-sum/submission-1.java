class Solution {
    public int[] twoSum(int[] nums, int target) {
        int leftPointer = 0;
        int rightPointer = leftPointer + 1;

        while (leftPointer != nums.length){
            if (rightPointer == nums.length) {
                leftPointer++;
                rightPointer = leftPointer + 1;
            }

            if (nums[leftPointer] + nums[rightPointer] == target) {
                break;
            }
            rightPointer++;
        }

        return new int[] {leftPointer, rightPointer};
    }
}