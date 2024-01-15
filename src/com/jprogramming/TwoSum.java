package com.jprogramming;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public TwoSum(){}

    public int[] twoSumSolution(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])){
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }

        return new int[0];
    }
}
