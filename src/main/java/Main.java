
public class Main {
    public static void main(String[] args) {
        groupSum(0, new int []{2, 4, 8}, 9);
        System.out.println(counter);
    }

    static int counter = 0;
    public static boolean groupSum(int start, int[] nums, int target) {
        counter++;
        System.out.println("");
        if (start == nums.length){
            return target == 0;
        }

        return groupSum(start+1, nums, target-nums[start]) || groupSum(start+1, nums, target);
    }


}