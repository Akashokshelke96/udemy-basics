package prepfortechQs;

import java.util.HashMap;
import java.util.Map;

public class PrintSum {
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 12;
        arr[1] = 2;
        arr[2] = 8;
        arr[3] = 6;
        System.out.println(twoSum(arr,20));

    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{
                        map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two such input");
    }
}