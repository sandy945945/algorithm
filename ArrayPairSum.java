import java.util.Arrays;

public class ArrayPairSum {
    public static void main(String[] args) {
        int[] nums1 = new int[]{9,1,5,6,7,2};
        arrayPairSum(nums1);
    }

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        int k=0;
        while(k<nums.length) {
            sum += nums[k];
            k += 2;
        }

        return sum;
    }
}