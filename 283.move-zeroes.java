/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {

        //1.暴力解法--速度极慢
        // int i = 0;
        // int flag = 0;
        // while(i<nums.length){
        //     if(nums[i] == 0){
        //         for(int j = i;j < nums.length-1;j++){
        //             nums[j] = nums[j+1];
        //         }
        //         nums[nums.length-1] = 0;
        //     }
        //     if(nums[i] == 0){
        //         flag++;
        //         if(flag<nums.length) {
        //             continue;
        //         }else{
        //             break;
        //         }
        //     }else{
        //         i++;
        //     }
        // }

        //2.双指针
        int i = 0,
            j = 0;//记录
        while(i<nums.length){
            if(nums[i] != 0){
                nums[j] = nums[i];
                if(i != j)
                    nums[i] = 0;
                j++;
                }
            i++;
        }
    }
}
// @lc code=end