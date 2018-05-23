public class Recursion2 {
    public static boolean groupSum(int start, int[] nums, int target) {
        if (start == nums.length){
            return target == 0;
        }

        return groupSum(start+1, nums, target-nums[start]) || groupSum(start+1, nums, target);
    }
    public static boolean groupSum6(int start, int[] nums, int target) {
        if (start == nums.length){
            return target == 0;
        }

        if (nums[start] == 6){
            return groupSum6(start+1, nums, target-nums[start]);
        }

        return groupSum6(start+1, nums, target-nums[start]) || groupSum6(start+1, nums, target);
    }

    public static boolean groupNoAdj(int start, int[] nums, int target) {
        if (start >= nums.length){
            return target == 0;
        }

        return groupNoAdj(start+2, nums, target-nums[start]) || groupNoAdj(start+1, nums, target);
    }
}
