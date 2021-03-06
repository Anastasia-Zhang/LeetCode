import java.util.Arrays;

/***
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 */


public class RotateArray {
    public static void rotate(int[] nums, int k) {
        for (int i = 0;i < k;i ++){
            int lastNum = nums[nums.length - 1];
            for(int j = nums.length - 1;j > 0;j --){
                nums[j] = nums[j - 1];
            }
            nums[0] = lastNum;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        rotate(nums,3);
    }
}
