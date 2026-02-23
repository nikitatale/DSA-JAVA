public class FindRange {

    public static int firstIndex(int[] nums, int target) {
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

    public static int lastIndex(int[] nums, int target) {
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

    public static int[] findRange(int[] nums, int target) {
        return new int[]{ firstIndex(nums, target), lastIndex(nums, target) };
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 4, 4, 5, 6};
        int target = 4;

        int[] range = findRange(nums, target);
        System.out.println("Range = [" + range[0] + ", " + range[1] + "]");
    }
}
