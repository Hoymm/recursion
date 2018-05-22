package recursion1;

public class _16_array11 {
    public int array11(int[] nums, int index) {
    if (nums.length == index){
        return 0;
    }

    int curValue = nums[index] == 11 ? 1 : 0;
    return curValue + array11(nums, ++index);
}

}
