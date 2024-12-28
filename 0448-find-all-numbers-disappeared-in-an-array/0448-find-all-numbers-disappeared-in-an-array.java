class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
    int[] res = new int[nums.length + 1];
	for (int num : nums) {
		res[num] = num;
	}

	List<Integer> result = new ArrayList<>();
	for (int i = 1; i <= nums.length; i++) {
		if (res[i] == 0) {
			result.add(i);
		}
	}
	return result;
    }
}