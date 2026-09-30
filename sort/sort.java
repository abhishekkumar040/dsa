// import java.util.Arrays;

// class sort {
//     public int[] sortArray(int[] nums) {
//         int n = nums.length;
        
//         // Selection Sort logic
//         for (int i = 0; i < n - 1; i++) {
//             int minIndex = i;
//             for (int j = i + 1; j < n; j++) {
//                 if (nums[j] < nums[minIndex]) {
//                     minIndex = j;
//                 }
//             }
//             int temp = nums[minIndex];
//             nums[minIndex] = nums[i];
//             nums[i] = temp;
//         }
        
//         return nums;
//     }

//     public static void main(String[] args) {
//         sort sorter = new sort();
//         int[] input = {5, 2, 3, 1};
        
//         sorter.sortArray(input);
        
//         System.out.println(Arrays.toString(input));
//     }
// }


// public class sort {
    
//     public static int[] bubbleSort(int[] nums) {
//         int n = nums.length;
//         for (int i = n - 1; i >= 0; i--) {
//             boolean didSwap = false;
//             for (int j = 0; j <= i - 1; j++) {
//                 if (nums[j] > nums[j + 1]) {
//                     int temp = nums[j];
//                     nums[j] = nums[j + 1];
//                     nums[j + 1] = temp;
//                     didSwap = true;
//                 }
//             }
//             if (!didSwap) {
//                 break;
//             }
//         }
//         return nums;
//     }

//     public static void main(String[] args) {
//         int[] nums = {7, 4, 1, 5, 3};
        
//         bubbleSort(nums);
        
//         System.out.print("Sorted Array: ");
//         for (int num : nums) {
//             System.out.print(num + " ");
//         }
//     }
// }