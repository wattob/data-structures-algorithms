/*
* From https://neetcode.io/
* reference:
* javac .\Valid-Palindrome.java
* java Solution
*/

class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            Character start = s.charAt(i);
            Character end = s.charAt(j);

            if (!Character.isLetterOrDigit(start)) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(end)) {
                j--;
                continue;
            }
            if (Character.toLowerCase(start) != Character.toLowerCase(end)) {
                return false;
            }
            i++;
            j--;

        }
        return true;

    }

    // Checking test cases with implementation 
    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome("A man, a plan, a canal: Panama"));

        System.out.println(new Solution().isPalindrome("race a car"));

        System.out.println(new Solution().isPalindrome(" "));
    }

    /*
    * Alternative solutions:
    */
    // public boolean isPalindrome(String s) { 
    // }

}
