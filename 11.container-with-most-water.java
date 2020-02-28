/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        //1.暴力枚举  O（n*n）
        // int max = 0;
        // for ( int i = 0; i < height.length; i++) {
        //     for (int j = i+1; j < height.length; j++) {
        //         int area = (j-i)*Math.min(height[i],height[j]);
        //         max = Math.max(area, max);
        //     }
        // }
        // return max;

        //2.两个柱子根据一定规则往中间移动依次，将每次移动后的面积与当前最大面积进行比较
        //O（n）
        int i = 0;
        int j = height.length-1;
        //初始的面积
        int area = (j-i)*(height[i]<height[j]?height[i]:height[j]);
        while(i<j){
            if(height[i]>height[j]){
                j--;
            }else{
                i++;
            }
            int temp = (j-i)*(height[i]<height[j]?height[i]:height[j]);
            //面积更新
            area = temp>area?temp:area;
        }
        return area;
    }
}
// @lc code=end
