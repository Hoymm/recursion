import java.util.Arrays;

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

    public static boolean groupSum5(int start, int[] nums, int target) {
        if (start >= nums.length){
            return target == 0;
        }

        if (nums[start]%5 == 0){
            if (start+1 < nums.length && nums[start+1] == 1){
                return groupSum5(start+2, nums, target-nums[start]);
            }
            else{
                return groupSum5(start+1, nums, target-nums[start]);
            }
        }
        else{
            return groupSum5(start+1, nums, target) || groupSum5(start+1, nums, target-nums[start]);
        }
    }

    public static boolean groupSumClump(int start, int[] nums, int target) {
        if (start >= nums.length){
            return target == 0;
        }

        int groupTotalValue = 0;
        for (int i = start; i < nums.length && nums[i] == nums[start]; ++i){
            groupTotalValue += nums[start];
        }
        int groupElements = groupTotalValue/nums[start];
        // single element
        if (groupElements == 1){
            return groupSumClump(start+1, nums, target) || groupSumClump(start+1, nums, target-nums[start]);
        }
        // there are numbers in the array that are adjacent and the identical value
        else{
            return groupSumClump(start+groupElements, nums, target) || groupSumClump(start+groupElements, nums, target-groupTotalValue);
        }
    }

    public static boolean splitArray(int[] nums) {
        return splitHelper(0, nums, 0, 0);
    }

    public static boolean splitHelper(int curIndex, int nums[], int group1, int group2){
        if (curIndex == nums.length){
            return group1 == group2;
        }
        else{
            return splitHelper(curIndex+1, nums, group1+nums[curIndex], group2)
                    || splitHelper(curIndex+1, nums, group1, group2+nums[curIndex]);
        }
    }

}
