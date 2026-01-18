class Solution {
    public void reverseString(char[] s) {
        int len=s.length;
        for(int i=0;i<len/2;i++){
            if(s[i]!=s[len-1-i]){
                swap(s,i,len-1-i);
            }
        }
    }
    static void swap(char[] s,int a,int b){
        char temp=s[a];
        s[a]=s[b];
        s[b]=temp;
    }
}