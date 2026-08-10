class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void mergeSort(int[] nums, int low, int high) {

        if (low >= high) {
            return;
        }

        int mid = low + (high - low) / 2;

        // Left half
        mergeSort(nums, low, mid);

        // Right half
        mergeSort(nums, mid + 1, high);

        // Merge both halves
        merge(nums, low, mid, high);
    }

    public void merge(int[] nums, int low, int mid, int high) {

        int[] temp = new int[high - low + 1];

        int i = low;
        int j = mid + 1;
        int k = 0;

        // Compare both halves
        while (i <= mid && j <= high) {

            if (nums[i] <= nums[j]) {
                temp[k] = nums[i];
                i++;
            } else {
                temp[k] = nums[j];
                j++;
            }

            k++;
        }

        // Remaining elements from left half
        while (i <= mid) {
            temp[k] = nums[i];
            i++;
            k++;
        }

        // Remaining elements from right half
        while (j <= high) {
            temp[k] = nums[j];
            j++;
            k++;
        }

        // Copy temp back to nums
        for (int x = 0; x < temp.length; x++) {
            nums[low + x] = temp[x];
        }
    }
}