package com.company;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();

        for (int i =0; i<nums.length; i++) {

            Integer res = target - nums[i];

            if (hash.containsKey(res)){
                int output[] = {hash.get(res), i};
                return output;
            }

            hash.put(nums[i], i);

        }

        return null;

    }

    public static void main(String[] args) {
        // Two Sum
        int[]nums = new int[] {3, 2, 4};
        int target = 6;

        int result[] = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
