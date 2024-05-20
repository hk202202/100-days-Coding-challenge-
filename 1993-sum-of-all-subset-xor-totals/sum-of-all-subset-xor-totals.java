class Solution {
    public int subsetXORSum(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i:nums){
            
            sum |=i;
        }
        return sum<<(n-1);
    }
}