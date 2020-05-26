
/*

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/
public class TargetArray {

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i <= nums.length; i++) {
            if (nums[i] + nums[i + 1] == target) {
                return new int[]{i, i + 1};
            }
        }
        return nums;
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 7, 15} ;
         int target = 9;
         int[] res = twoSum(nums,target);
        for(int rows:res)
        {
            System.out.println(rows);
        }
    }

}