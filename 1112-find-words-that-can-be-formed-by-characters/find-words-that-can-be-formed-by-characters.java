class Solution {
    public int countCharacters(String[] words, String chars) {
        int totalLength=0;
        int[] alphabet=new int[26];
        for(String word:words){
            fillAlphabet(alphabet,chars);
            if(isGoodString(word,alphabet)){
                totalLength+=word.length();
            }
        }
        return totalLength;
    }
    static void fillAlphabet(int[] alphabet,String chars){
        Arrays.fill(alphabet,0);
         for(int i=0;i<chars.length();i++){
            alphabet[chars.charAt(i)-'a']++;
        }
    }
    static boolean isGoodString(String word,int[] alphabet){
        for(int i=0;i<word.length();i++){
            alphabet[word.charAt(i)-'a']--;
        }
        for(int i=0;i<alphabet.length;i++){
            if(alphabet[i]<0){
                return false;
            }
        }
        return true;
    }
}