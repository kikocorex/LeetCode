package Java;

import java.util.Arrays;

class TwoSum {
    public static int[] sum(int[] nums, int target) {
        int[] result = new int[2]; //return only 2 elements

        // check first and second element
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // check if sum is == to the target
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }


        return result;
    }

    public static void main(String[] args) {

            int[] input = {3, 2, 4};
            int target = 6;

            int[] result = sum(input, target);
            System.out.println(Arrays.toString(result));
        }
    }
