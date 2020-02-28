class Solution {
    
    public boolean isPalindrome(String s) {
    /*思路：
    1.先转成字符数组
    2.遍历每一个字符
    */
    char [] c = s.toCharArray();
    for(int i=0;i<c.length;i++){
        if(c[i]>='A' && c[i]<='Z'){
            c[i]+=32;
        }
    }

    int i = 0;
    int j = c.length - 1;
    while(true){
        while(!(c[i]>='0'&&c[i]<='9' || c[i]>='a' && c[i]<='z')){
            i++;
        }
        while(!(c[j]>='0'&&c[j]<='9' || c[j]>='a' && c[j]<='z')){
            j--;
        }
        if(i>j)
            break;
        if(c[i] != c[j]){
            return false;
        }
    }
    return true;       
    }
}
