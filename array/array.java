public class array {
    
    // Yeh wohi function hai jo aapne problem solve karne ke liye likha tha
    public static int linearSearch(int nums[], int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i; // Target milne par uska index return kar do
            }
        }
        return -1; // Agar target nahi mila toh -1
    }

    public static void main(String[] args) {
        // Test case data
        int nums[] = {2, 3, 4, 5, 3};
        int target = 3;

        // Function ko call karke result nikalna
        int result = linearSearch(nums, target);

        // Output print karna
        if (result != -1) {
            System.out.println("Target " + target + " mil gaya index: " + result);
        } else {
            System.out.println("Target array mein maujud nahi hai.");
        }
    }
}


public class array {
    
    public static int findLargestElement(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Test case
        int[] nums = {3, 3, 0, 99, -40};
        
        int result = findLargestElement(nums);
        
        System.out.println("The largest element is: " + result);
    }
}



class Solution {
    public int findKthLargest(int[] nums, int k) {
      Arrays.sort(nums);
        return nums[nums.length-k];
    }
}

class Solution {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        
        int n = nums.length;
        k = k % n; // Handle cases where k is greater than the array length
        
        // 1. Reverse the entire array
        reverse(nums, 0, n - 1);
        // 2. Reverse the first k elements
        reverse(nums, 0, k - 1);
        // 3. Reverse the remaining n - k elements
        reverse(nums, k, n - 1);
    }
    
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currentcount=0;
        int maxcount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                currentcount++;
                if(currentcount > maxcount){
                   maxcount = currentcount;
                }
                }else{
                    currentcount =0;
                }

            
        }
        return maxcount;
    }
}

class solution {
    public void movezero(int [] nums){
        int zero = 0;
        for(int i=0;i<nums.length;i++){
            if (nums [i] != 0){
                nums[zero++]=nums[i];
            }
        }
        while(zero<nums.length){ 
       nums[zero++]= =;
        }
    }
}

import java.util.ArrayList;

class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0, n = nums1.length, m = nums2.length;
        
        while (i < n || j < m) {
            int val;
            if (i < n && (j >= m || nums1[i] <= nums2[j])) {
                val = nums1[i++];
            } else {
                val = nums2[j++];
            }
            
            // Add only if it's the first element or different from the last added
            if (list.isEmpty() || list.get(list.size() - 1) != val) {
                list.add(val);
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

import java.util.ArrayList;

class Solution {
    public int[] intersectionArray(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int i = 0, j = 0;
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums2[j] < nums1[i]) {
                j++;
            } else {
                // Both elements are equal, add to result and move both pointers
                ans.add(nums1[i]);
                i++;
                j++;
            }
        }
        
        // Convert ArrayList to primitive int array
        int[] result = new int[ans.size()];
        for (int k = 0; k < ans.size(); k++) {
            result[k] = ans.get(k);
        }
        
        return result;
    }
}



class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int candidate=0;
        for(int num : nums){
            if(count==0){
                candidate=num;
            }if(num==candidate){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
        
    }
}



class Solution {
    public List<Integer> leaders(int[] nums) {
        List<integer> ans=new ArrayList<>();
        if(nums==null || nums.length==0){
            return ans;
        }
        int n=nums.length;
        int max=nums[n-1];
        ans.add(max);
        for(int i=n-2;i>=n;i--){
            if(nums[i]>max){
                max=nums[i];
                ans.add(max);
            }
        }
        Collection.reverse(ans);
        return ans;
        
    }
}


class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        if (numRows <= 0) {
            return triangle;
        }
        
        // First row is always [1]
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> currRow = new ArrayList<>();
            
            currRow.add(1); // The first element of each row is 1
            
            // Each triangle element is the sum of the elements above-and-to-the-left and above-and-to-the-right
            for (int j = 1; j < i; j++) {
                currRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            
            currRow.add(1); // The last element of each row is 1
            triangle.add(currRow);
        }
        
        return triangle;
    }
}



class Solution {
    public List<Integer> getRow(int r) {
        int[] ans = new int[r + 1];
        ans[0] = 1;
        long current = 1;
        
        for (int i = 1; i <= r; i++) {
            current = current * (r - i + 1);
            current = current / i;
            ans[i] = (int) current;
        }
        
        List<Integer> list = new ArrayList<>();
        for (int val : ans) {
            list.add(val);
        }
        return list;
    }
}

class Solution {
    public int[] pascalTriangleII(int r) {
        int [] ans=new int [r];
        ans[0]=1;
        long current =1;
        for (int i=1;i<r;i++){
            current=current*(r-i);
            current=current/i;
            ans[i]=(int)current;
        }
        return ans;

    }
}