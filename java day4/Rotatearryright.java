public class Rotatearryright {
    public static void rotateRight(int[] nums, int k) {
        int n = nums.length;
        k = k % n; 
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void moveZerosToRight(int[] nums) {
        int n = nums.length;
        int j = 0; // position to place non-zero element
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                // swap nums[i] and nums[j]
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12, 0, 5};
        moveZerosToRight(nums);
        System.out.println(java.util.Arrays.toString(nums)); 
    }
    
}
