class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0 ) {return 0;}
        Set<Integer> s = new HashSet();
        for (int n : nums){
            s.add(n);
        }
        int count = 1;
        int max = 1;
        for (Integer n : s){
            if (!s.contains(n-1)){
                count = 1;
                int current = n;
                while (s.contains(current+1)){
                    count++;
                    current++;
                }
                max = Math.max(count,max);
            }
        }
        return max;
    }
}
