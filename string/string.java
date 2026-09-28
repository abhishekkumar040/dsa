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


