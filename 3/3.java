class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = s.length();
        int j = 0;
        int max = 0;
        Map<Character,Integer> hashMap = new HashMap<Character,Integer>();
        for (int i = 0;i < l; i++){
            if(hashMap.containsKey(s.charAt(i))){
             j = Math.max(hashMap.get(s.charAt(i)),j);
            } 
                max = Math.max(max,i-j+1);
              hashMap.put(s.charAt(i), i+1);  
              
        }

        return max;
}
}
//设立ij两个下标表示子字符串的左右两边，若字符重复，i移到左边重复字符的右边一位