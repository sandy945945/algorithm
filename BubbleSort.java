public class BubbleSort {
    public static void main(String[] args) {
        int[] nums1 = new int[]{9,1,5,6,7,2};
        bubbleSort(nums1);
    }

    public static void bubbleSort(int[] nums) {
        int tmp;
        int last = nums.length;
        boolean flag;
        for (int j = 0; j < nums.length - 1; j++) {
            flag = false;
            for (int i = 0; i < last - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    tmp = nums[i + 1];
                    nums[i + 1] = nums[i];
                    nums[i] = tmp;
                    flag = true;
                }
            }
            last -= 1;
            if (!flag) {
                break;
            }
        }
    }
}
