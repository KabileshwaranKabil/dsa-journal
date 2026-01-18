class Solution {
    public String restoreString(String s, int[] indices) {
        int n=s.length();
        char[] sh=s.toCharArray();
        for(int i=0;i<n;i++){
            sh[indices[i]]=s.charAt(i);
        }
        return new String(sh);
    }
}