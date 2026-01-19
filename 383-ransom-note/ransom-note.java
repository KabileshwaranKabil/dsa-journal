class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int rlen=ransomNote.length();
        int mlen=magazine.length();
        if(rlen<=mlen){
            int[] alphabet=new int[26];
            for(int i=0;i<mlen;i++){
                alphabet[magazine.charAt(i)-'a']++;
            }
            for(int i=0;i<rlen;i++){
                alphabet[ransomNote.charAt(i)-'a']--;
            }
            for(int i=0;i<alphabet.length;i++){
                if(alphabet[i]<0){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}