import java.util.Arrays;
import java.util.HashMap;

/*
* From https://neetcode.io/
* javac .\Two-Sum.java
* java Solution
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int result = target - nums[i]; // 9-2
            if (map.containsKey(result)) { // 7
                return new int[] {map.get(result), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    // Checking test cases with implementation 
    public static void main(String[] args) {
        int[] exampleOne = new int[]{2,7,11,15}; 
        System.out.println(Arrays.toString(new Solution().twoSum(exampleOne, 9)));

        int[] exampleTwo = new int[]{3,2,4}; 
        System.out.println(Arrays.toString(new Solution().twoSum(exampleTwo, 6)));

        int[] exampleThree = new int[]{3,3};
        System.out.println(Arrays.toString(new Solution().twoSum(exampleThree, 6)));
    }

    /*
    * Alternative solutions:
    * Check each object against the remainder don't have to check the number before because we already checked it
    */
    public int[] twoSumForLoop(int[] nums, int target) {
        for (int i =0; i< nums.length; i++) {
            for (int j = i+1; j < nums.length; j++){
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                    // return new int[]{nums[i],  nums[j]}; // returns number we want the location in the Array
                }
            }
        }
        return new int[]{};
    }

}
