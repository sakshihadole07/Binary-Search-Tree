class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        // Find next greater element for every number in nums2
        for (int num : nums2) {

            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }

            stack.push(num);
        }

        // Remaining elements don't have a greater element
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }

        // Build answer for nums1
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}