// public class string {
//     public static void reverseString(char[] s) {
//         int left = 0;
//         int right = s.length - 1;
        
//         while (left < right) {
//             char temp = s[left];
//             s[left] = s[right];
//             s[right] = temp;
            
//             left++;
//             right--;
//         }
//     }

//     public static void main(String[] args) {
//         char[] s = {'h', 'e', 'l', 'l', 'o'};
//         reverseString(s);
//         System.out.println(s); // Output: olleh
//     }
// }

// public class ValidPalindrome {
//     public static boolean isPalindrome(String s) {
//         if (s == null) {
//             return false;
//         }
        
//         String cleaned = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        
//         int left = 0;
//         int right = cleaned.length() - 1;
        
//         while (left < right) {
//             if (cleaned.charAt(left) != cleaned.charAt(right)) {
//                 return false;
//             }
//             left++;
//             right--;
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         // Test cases
//         String test1 = "A man, a plan, a canal: Panama";
//         String test2 = "race a car";
//         String test3 = " ";

//         System.out.println("Test 1: " + isPalindrome(test1)); // Expected: true
//         System.out.println("Test 2: " + isPalindrome(test2)); // Expected: false
//         System.out.println("Test 3: " + isPalindrome(test3)); // Expected: true
//     }
// }


// public class Solution {
//     public String longestCommonPrefix(String[] str) {
//         if (str == null || str.length == 0) {
//             return "";
//         }
        
//         // Take the first string as our initial baseline prefix
//         String prefix = str[0];
        
//         // Compare the prefix with every other string in the array
//         for (int i = 1; i < str.length; i++) {
//             // While the current string doesn't start with the prefix, shorten the prefix
//             while (str[i].indexOf(prefix) != 0) {
//                 prefix = prefix.substring(0, prefix.length() - 1);
                
//                 if (prefix.isEmpty()) {
//                     return "";
//                 }
//             }
//         }
        
//         return prefix;
//     }

//     // Main method to test your code locally on your system
//     public static void main(String[] args) {
//         Solution sol = new Solution();

//         // Test Case 1
//         String[] test1 = {"flowers", "flow", "fly", "flight"};
//         System.out.println("Test 1 Result: " + sol.longestCommonPrefix(test1)); // Expected: "fl"

//         // Test Case 2
//         String[] test2 = {"dog", "cat", "animal", "monkey"};
//         System.out.println("Test 2 Result: " + sol.longestCommonPrefix(test2)); // Expected: ""

//         // Test Case 3
//         String[] test3 = {"lady", "lazy"};
//         System.out.println("Test 3 Result: " + sol.longestCommonPrefix(test3)); // Expected: "la"
//     }
// }

// import java.util.HashMap;

// public class Isomorphic {
//     public boolean isomorphicString(String s, String t) {
//         // Edge case: if lengths differ, they can't be isomorphic
//         if (s.length() != t.length()) {
//             return false;
//         }

//         HashMap<Character, Character> mapS2T = new HashMap<>();
//         HashMap<Character, Character> mapT2S = new HashMap<>();

//         for (int i = 0; i < s.length(); i++) {
//             char charS = s.charAt(i);
//             char charT = t.charAt(i);

//             // Check if mapping from s -> t already exists and is inconsistent
//             if (mapS2T.containsKey(charS) && mapS2T.get(charS) != charT) {
//                 return false;
//             }

//             // Check if mapping from t -> s already exists and is inconsistent
//             if (mapT2S.containsKey(charT) && mapT2S.get(charT) != charS) {
//                 return false;
//             }

//             // Establish the mappings
//             mapS2T.put(charS, charT);
//             mapT2S.put(charT, charS);
//         }

//         return true;
//     }

//     public static void main(String[] args) {
//         Isomorphic solver = new Isomorphic();

//         String s1 = "egg";
//         String t1 = "add";
//         System.out.println("Test 1 (\"egg\", \"add\"): " + solver.isomorphicString(s1, t1)); // Expected: true

//         String s2 = "apple";
//         String t2 = "bbnbm";
//         System.out.println("Test 2 (\"apple\", \"bbnbm\"): " + solver.isomorphicString(s2, t2)); // Expected: false
//     }
// }


// import java.util.Arrays;

// public class Solution {
//     public boolean isAnagram(String s, String t) {
//         // Agar lengths barabar nahi hain
//         if (s.length() != t.length()) {
//             return false;
//         }
        
//         // Strings ko character array mein badal kar sort karo
//         char[] sArray = s.toCharArray();
//         char[] tArray = t.toCharArray();
//         Arrays.sort(sArray);
//         Arrays.sort(tArray);
        
//         // Check karo ki dono sorted arrays barabar hain ya nahi
//         return Arrays.equals(sArray, tArray);
//     }

//     // VS Code mein code run karne ke liye main method
//     public static void main(String[] args) {
//         Solution solution = new Solution();
        
//         String s1 = "anagram";
//         String t1 = "nagaram";
//         System.out.println("Test 1: " + solution.isAnagram(s1, t1)); // Expected: true

//         String s2 = "rat";
//         String t2 = "car";
//         System.out.println("Test 2: " + solution.isAnagram(s2, t2)); // Expected: false
//     }
// }


// import java.util.*;

// public class Solution {
//     public String frequencySort(String s) {
//         // Count frequencies for all characters
//         Map<Character, Integer> counts = new HashMap<>();
//         for (char c : s.toCharArray()) {
//             counts.put(c, counts.getOrDefault(c, 0) + 1);
//         }
        
//         // Put characters into a list and sort by frequency descending
//         List<Character> list = new ArrayList<>(counts.keySet());
//         list.sort((a, b) -> counts.get(b) - counts.get(a));
        
//         // Build the result string
//         StringBuilder sb = new StringBuilder();
//         for (char c : list) {
//             int freq = counts.get(c);
//             for (int i = 0; i < freq; i++) {
//                 sb.append(c);
//             }
//         }
        
//         return sb.toString();
//     }

//     // Optional main method if you want to test it locally in VS Code
//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         String test = "tree";
//         System.out.println("Input: " + test);
//         System.out.println("Output: " + sol.frequencySort(test));
//     }
// }