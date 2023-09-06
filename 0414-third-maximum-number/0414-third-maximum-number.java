class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> ts = new TreeSet<>();
        
        for(int i = 0; i<nums.length ; i++){
            ts.add(nums[i]);
        }

        if(ts.size() >= 3){
            ts.pollLast();
            ts.pollLast();
        }
        return ts.last();
    }
}