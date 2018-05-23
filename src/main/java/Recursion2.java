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

    public static boolean splitOdd10(int[] nums) {
        return splitArrayHelper(0, nums, 0, 0);
    }

    public static boolean splitArrayHelper(int curIndex, int nums[], int groupOne, int groupTwo){
        if (curIndex == nums.length){
            return isFirstMultipleOf10AndOtherOdd(groupOne, groupTwo)
                    || isFirstMultipleOf10AndOtherOdd(groupOne, groupTwo);
        }
        else{
            return splitArrayHelper(curIndex+1, nums, groupOne+nums[curIndex], groupTwo)
                    || splitArrayHelper(curIndex+1, nums, groupOne, groupTwo+nums[curIndex]);
        }
    }

    public static boolean isFirstMultipleOf10AndOtherOdd(int first, int second){
        return first%10 == 0 && second%2 == 1;
    }


    public static boolean split53(int[] nums) {
        return split53Helper(0, nums, 0, 0);
    }

    public static boolean split53Helper(int curIndex, int nums[], int groupOne, int groupTwo){
        if (curIndex == nums.length){
            return groupOne == groupTwo;
        }
        else{
            if (nums[curIndex]%5 == 0){
                return split53Helper(curIndex+1, nums, groupOne+nums[curIndex], groupTwo);
            }
            else if (nums[curIndex]%3 == 0){
                return split53Helper(curIndex+1, nums, groupOne, groupTwo+nums[curIndex]);
            }

            return split53Helper(curIndex+1, nums, groupOne+nums[curIndex], groupTwo)
                    || split53Helper(curIndex+1, nums, groupOne, groupTwo+nums[curIndex]);
        }
    }


}
