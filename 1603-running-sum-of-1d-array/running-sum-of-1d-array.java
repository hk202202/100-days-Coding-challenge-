class Solution {
    public int[] runningSum(int[] nums) {
    //     int Sum[]=new int[nums.length];
    //     int sum=0;
    //     for(int i=0;i<nums.length;i++){
    //         sum+=nums[i];
    //         Sum[i]+=sum;
    //     }
    //     return Sum;
    // }
           for(int i=1;i<nums.length;i++){
            nums[i]=nums[i]+nums[i-1];
    }

    return nums;
}
}