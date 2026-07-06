public class Main {

    /**
     * Finds the indices of two numbers whose sum equals the target.
     *
     * Algorithm:
     * 1. Traverse the array using the first loop.
     * 2. For each element, check every remaining element.
     * 3. If the sum of two elements equals the target, return their indices.
     *
     * Time Complexity: O(n²)
     * Space Complexity: O(1)
     *
     * @param nums Input array of integers.
     * @param target Target sum.
     * @return Array containing the indices of the two numbers.
     */
    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] {};
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}