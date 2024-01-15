

import com.jprogramming.*;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        TwoSum twoSum = new TwoSum();

        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        int[] output =  twoSum.twoSumSolution(nums, target);
        System.out.println(output[0] + " " + output[1]);

    }
}