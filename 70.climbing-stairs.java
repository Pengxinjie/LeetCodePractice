/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        //1.暴力递归
        /*思路：
        爬上第n阶台阶可以分解为 第n-1阶台阶 加1 或 第n-2阶台阶加2
       
        时间复杂度太高
        */
        // if(n<=3)
        //     return n;
        // return climbStairs(n-1)+climbStairs(n-2);
    
        //2.用递归解决得了的，大部分用循环也能解决
        if(n<=3)
             return n;
        int i = 1;
        int j = 2;
        int sum = 0;//记录次数
        while(n-->2){
            sum = i + j;
            i = j;
            j = sum;
        }
        return sum;
    }
}
// @lc code=end

