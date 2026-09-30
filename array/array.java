// public class array {
    
//     // Yeh wohi function hai jo aapne problem solve karne ke liye likha tha
//     public static int linearSearch(int nums[], int target) {
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] == target) {
//                 return i; // Target milne par uska index return kar do
//             }
//         }
//         return -1; // Agar target nahi mila toh -1
//     }

//     public static void main(String[] args) {
//         // Test case data
//         int nums[] = {2, 3, 4, 5, 3};
//         int target = 3;

//         // Function ko call karke result nikalna
//         int result = linearSearch(nums, target);

//         // Output print karna
//         if (result != -1) {
//             System.out.println("Target " + target + " mil gaya index: " + result);
//         } else {
//             System.out.println("Target array mein maujud nahi hai.");
//         }
//     }
// }


// public class array {
    
//     public static int findLargestElement(int[] nums) {
//         int max = nums[0];
//         for (int i = 1; i < nums.length; i++) {
//             if (nums[i] > max) {
//                 max = nums[i];
//             }
//         }
//         return max;
//     }

//     public static void main(String[] args) {
//         // Test case
//         int[] nums = {3, 3, 0, 99, -40};
        
//         int result = findLargestElement(nums);
        
//         System.out.println("The largest element is: " + result);
//     }
// }