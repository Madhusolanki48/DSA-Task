class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums==null || k<=0)
        return new int[0];
    
    int n=nums.length;
    int[] r=new int[n-k+1];
    int ri=0;
    //store index
    Deque<Integer> q=new ArrayDeque<>();
    for(int i=0;i<nums.length; i++){
        //remove numbers out of range k
        while(!q.isEmpty() && q.peek() < i-k+1 ){
            q.poll();
        }
        //Remove smaller number in k range as they are useless
        while(!q.isEmpty() && nums[q.peekLast()] < nums[i]){
            q.pollLast();
        }
        //q contains index... r contains content
        q.offer(i);
        if(i >= k-1){
            r[ri++]=nums[q.peek()];
        }
    }
    return r;
}
}