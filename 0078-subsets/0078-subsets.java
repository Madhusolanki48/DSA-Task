class Solution {
    public List<List<Integer>> subsets(int[] nums) {
     List<List<Integer>> result=new ArrayList<>();
		for(int i=0;i<(1<<nums.length);i++)
		{
			int j=nums.length-1;
			ArrayList<Integer> list=new ArrayList<>();
			while(j>=0)
			{
				if((i&(1<<(nums.length-1-j)))!=0)
				{
					list.add(nums[nums.length-1-j]);
				}
				j--;
			}
			result.add(new ArrayList<>(list));
		}
		return result;
    }
}