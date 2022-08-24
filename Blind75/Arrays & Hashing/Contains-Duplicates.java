import java.util.HashSet;
import java.util.Set;

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
}
