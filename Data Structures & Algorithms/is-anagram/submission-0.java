class Solution {
    public boolean isAnagram(String s, String t) {
        // 2  way  to  solve  this problem -- 
            //1. using Hash Map   T.C - O(n+m)   and Space O(n) 
            //2.  using  basic  charachter  array of 26 T.C - O(n) 
            //space - O(1) constent  26  size  array only valid  if
            //  String Contain  only  single type lowercase or Uppercase-

            // 1.  using Hashmap - Neet Code  ,  2. on  Leetcode  

            int  n = s.length();
            int  m = t.length();

            if (  n != m){
                return  false;
            }
            HashMap<Character,Integer> map = new HashMap<>();

            for(int i=0;i<n ;i++){
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            }
            for(int i = 0;i<m;i++){
                char ch = t.charAt(i);
                if(!map.containsKey(ch)){
                    return false;
                }
                map.put(ch,map.get(ch)-1);

                if(map.get(ch) == 0 ){
                    map.remove(ch);
                }
            }

            if(!map.isEmpty()){
                return false;
            }

            return true;

    }
}
