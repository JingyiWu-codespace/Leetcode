package DataStructureAndAlgorithms.Leetcode;

//First Question
/*
Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution,
and you may not use the same element twice.
You can return the answer in any order.
 */

import java.util.HashMap;

//solution by self - nested (low runtime)
public class TwoSum {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int target =9;
        int [] nums = new int[]{2, 5, 3, 4, 7};
        int [] result = solution.twoSum(nums,9);
        System.out.println(result[0]+" "+result[1]);

        Solution2 solution2 = new Solution2();
        solution2.twoSum(nums,9);
        System.out.println(result[0]+" "+result[1]);
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int indicates[] = new int [2];
        for (int i = 0;i< nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    indicates[0]= i;
                    indicates[1] = j;
                }
            }
        }

        return indicates;
    }
}

class Solution2{
    public int[] twoSum(int[] nums,int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0;i< nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i); //key是nums值，value是索引
        }return new int[]{Integer.parseInt(null)};
    }
}