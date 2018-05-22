package recursion1;

public class _15_array6 {
    public boolean array6(int[] nums, int index) {
    if (index == nums.length){
        return false;
    }

    if(nums[index] == 6){
        return true;
    }

    return array6(nums, ++index);
}

}
