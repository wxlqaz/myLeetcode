public class Solution {
    public char findTheDifference(String s, String t) {
        int[] a = new int[26];
        char b = 'a';
        for (int i = 0; i< 26;i++){
            a[i] = 0;
        }
        int l1 = s.length();
        for (int j = 0; j< l1; j++){
            a[s.charAt(j)-97]++;
        }
        for (int k = 0; k<= l1; k++){
            a[t.charAt(k)-97]--;
        }
        for (int m = 0; m< 26;m++){
            if(a[m]<0){
                 b= (char) (m+97);
            }
        }
        return b;
    }
}