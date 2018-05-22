package recursion1;

public class _17_array220 {
    public boolean array220(int[] nums, int index) {
        if (index == nums.length){
            return false;
        }

        if (index+1 < nums.length){
            if (nums[index] == 0){
                if (nums[index+1] == 0){
                    return true;
                }
                else{
                    return array220(nums, ++index);
                }
            }

            if (nums[index+1]/nums[index] == 10 && nums[index+1]%nums[index] == 0){
                return true;
            }
        }

        return array220(nums, ++index);
    }
}
