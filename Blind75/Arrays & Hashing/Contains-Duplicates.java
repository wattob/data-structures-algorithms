import java.util.HashSet;
import java.util.Set;

/*
* From https://neetcode.io/
* javac .\Contains-Duplicates.java
* java Solution
*/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniques = new HashSet<>();
        for (int i=0; i < nums.length; i++) {
            if (uniques.contains(nums[i])){
                return true;
            }
            uniques.add(nums[i]);
        }
        return false;   
    }

    // Checking test cases with implementation 
    public static void main(String[] args) {
        int[] exampleOne = new int[]{1,2,3,1}; 
        // new Solution().containsDuplicate(exampleOne);
        System.out.println(new Solution().containsDuplicate(exampleOne));

        int[] exampleTwo = new int[]{1,2,3,4}; 
        // new Solution().containsDuplicate(exampleTwo);
        System.out.println(new Solution().containsDuplicate(exampleTwo));

        int[] exampleThree = new int[]{1,1,1,3,3,4,3,2,4,2};
        // new Solution().containsDuplicate(exampleThree);
        System.out.println(new Solution().containsDuplicate(exampleThree));
    }

    /*
    * Alternative solutions:
    * Check each object against the remainder. We don't need to cycle back to check the previous element because we already checked it
    * additional option includes sorting then check elements next to, but not optimal
    */
    public boolean containsDuplicateForLoop(int[] nums) {
        for (int i=0; i < nums.length; i++) {
            for (int j=i+1; j < nums.length; j++) {
                System.out.println(nums[i]); // Used to illustrate comparison 
                System.out.println(nums[j]);
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;   
    }

}
