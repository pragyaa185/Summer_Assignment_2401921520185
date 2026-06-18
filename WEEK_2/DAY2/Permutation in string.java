
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        if(len1 > len2) {
            return false;
        }
        int[] s1counts = new int[26];
        int[]wcounts = new int[26];
        for(int i= 0; i<len1; i++){
            s1counts[s1.charAt(i) - 'a']++;
            wcounts[s2.charAt(i) - 'a']++;
        }        
        if(matches(s1counts,wcounts)){
            return true;
        }
        for(int i =len1; i<len2; i++){
            int inElement= s2.charAt(i)-'a';
            int outElement =s2.charAt(i-len1) -'a';

            wcounts[inElement]++;
            wcounts[outElement]--;

            if(matches(s1counts,wcounts)){
                return true;

            }
        }
        return false;

    }
    private boolean matches(int[] arr1,int[] arr2){
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]){
                return false;

            }
            
        }
        return true;
    }
}