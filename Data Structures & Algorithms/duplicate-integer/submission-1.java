class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums.length == 2 ){
            if (nums[0] == nums[1]){
                return true ;
            }else{
                return false;
            }
        }
        else if (nums.length < 2){
            return false;
        }
        else{
            for (int i=0; i < nums.length; i++){
                for (int j=i+1;j<nums.length; j++){
                    if (nums[i]==nums[j]){
                        return true;
                    }
                }
            }
        }
        return false;
        
    }
}