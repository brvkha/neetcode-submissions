class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {return 0;}
        List<Integer> l = Arrays.stream(nums).boxed().sorted().distinct().toList();
        int max = 1;
        int count = 1;
        for (int i = 0 ; i< l.size()-1; i++){
            if ((l.get(i+1)-l.get(i)) == 1){
                count += 1;
                if (count >= max){
                    max = count;
                }
            } else {
                count = 1;
            }
        }
        return max;
    }
}
