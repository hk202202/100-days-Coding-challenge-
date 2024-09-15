class Solution {
    public int singleNumber(int[] nums) {

     
    //        for(int i=0;i<nums.length;i++){
    //        int count=0;
    //        for(int j=0;j<nums.length;j++){
    //            if(nums[j]==nums[i]){
    //                count++;
    //            }
    //        }

    //        if(count==1){
    //            return nums[i];
    //        }
    //    }
    //    return -1;

    //       }  

    
        int num=0;
        for(int number:nums){
            num=num^number;
        }
        return num;
    }
}
