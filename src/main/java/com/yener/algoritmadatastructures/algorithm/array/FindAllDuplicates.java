package com.yener.algoritmadatastructures.algorithm.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindAllDuplicates {

    public static List<Integer> findAllDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashSet.contains(nums[i])) {
                ans.add(nums[i]);
            } else {
                hashSet.add(nums[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums={33,6,3,1,33,4,3,6,1,7,7,8,6};
        List<Integer> duplicates=findAllDuplicates(nums);
        System.out.println(duplicates);
    }

}
