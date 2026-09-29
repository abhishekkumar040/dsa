import java.util.Arrays;

class sort {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        
        // Selection Sort logic
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
        
        return nums;
    }

    public static void main(String[] args) {
        sort sorter = new sort();
        int[] input = {5, 2, 3, 1};
        
        sorter.sortArray(input);
        
        System.out.println(Arrays.toString(input));
    }
}