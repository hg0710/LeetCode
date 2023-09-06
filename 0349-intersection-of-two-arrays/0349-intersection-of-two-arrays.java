class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        TreeSet<Integer> ts1 = new TreeSet<>();
        TreeSet<Integer> ts2 = new TreeSet<>();        
        
        for(int i =0 ; i < nums1.length ;i++){
            ts1.add(nums1[i]);
        }
        
        for(int j = 0 ; j < nums2.length ; j++){
            if(ts1.contains(nums2[j])){
                ts2.add(nums2[j]);
            }
        }
        
        int[] answer =new int[ts2.size()];
        int index = 0;
        Iterator<Integer> iterator = ts2.iterator();
        
        while (iterator.hasNext()) {
            answer[index++] = iterator.next();
        }
        
        return answer;
    }
}