import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        splitArray(new int [] {5, 2, 3});
    }

    public boolean splitArray(int[] nums) {
        if (nums.length == 0){
            return true;
        }
        else if (nums.length == 1){
            return false;
        }
        else if (nums.length == 2){
            return nums[0] == nums[1];
        }
        else{
            int [] subarrayFirstAdded = Arrays.copyOfRange(nums, 1, nums.length);
            subarrayFirstAdded[0] += nums[0];

            int [] subarrayLastAdded = Arrays.copyOfRange(nums, 0, nums.length-1);
            subarrayLastAdded[subarrayLastAdded.length-1] += nums[nums.length-1];

            return splitArray(subarrayFirstAdded) || splitArray(subarrayLastAdded);
        }
    }


}