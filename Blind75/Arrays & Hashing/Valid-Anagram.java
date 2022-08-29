import java.util.Arrays;

/*
* From https://neetcode.io/
* reference: https://www.youtube.com/watch?v=6C40mfRiTdA
* javac .\Valid-Anagram.java
* java Solution
*/

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] contents = new int[26]; // alphabet contains 26 letters

        for(int i = 0; i < s.length(); i++){
            contents[s.charAt(i) - 'a']++; // a=99, ascii code, to accommodate we subtract ascii code to match our array
            contents[t.charAt(i)- 'a']--; // increments if s contains, decrements if t contains
        }

        for(int j = 0; j < contents.length; j++){
            if(contents[j] != 0){
                return false;
            }
        }
        return true;

    }

    // Checking test cases with implementation 
    public static void main(String[] args) {
        System.out.println(new Solution().isAnagramBySorting("anagram", "nagaram"));

        System.out.println(new Solution().isAnagramBySorting("rat", "car"));
    }

    /*
    * Alternative solutions (Less optimal):
    * Convert to an array and sort. The sorted result should be equal for an anagram
    */
    public boolean isAnagramBySorting(String s, String t) {
        if (s.length() != t.length()){ //length vs length(). length() is used for string objects. length is length/size of array
            return false;
        }
        char sArray[] = s.toCharArray();
        char tArray[] = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);

    }

}
