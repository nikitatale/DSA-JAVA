public class FrequencyCount {

    public static int firstOccurrence(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                ans = mid;
                end = mid - 1;   
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }


    public static int lastOccurrence(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                ans = mid;
                start = mid + 1; 
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

   
    public static int countFrequency(int[] nums, int target) {
        int first = firstOccurrence(nums, target);
        if (first == -1) return 0;

        int last = lastOccurrence(nums, target);
        return last - first + 1;
    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 6, 12, 12, 12, 34, 56};
        int target = 12;

        int count = countFrequency(nums, target);
        System.out.println("Total Frequency = " + count);
    }
}
