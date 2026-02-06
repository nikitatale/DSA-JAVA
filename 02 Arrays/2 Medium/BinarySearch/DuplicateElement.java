public class DuplicateElement {

    public static void findDuplicates(int[] nums) {
        boolean found = false;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                System.out.println("Duplicate: " + nums[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No duplicates found");
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 4, 5, 6, 6};
        findDuplicates(nums);
    }
}
