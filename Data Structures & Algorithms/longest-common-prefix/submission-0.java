class Solution {
    class Node{
        Node arr[] = new  Node[26];
        boolean eow = false;
        int children;
        Node(){
            for(int i=0;i<26;i++){
                arr[i] = null;
            }
        }
    } 
    public Node root= new Node();
    public  void  insert(String word){
        Node curr = root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i) - 'a';
            if(curr.arr[idx] == null ){
                // add 
                curr.arr[idx] = new Node();
                curr.children ++;
            }
            curr = curr.arr[idx];
        }
        curr.eow = true;
    }
    public String longestCommonPrefix(String[] strs) {
        // inserting  all  word  in  Trie -- 
        for(int i =0;i<strs.length;i++){
            insert(strs[i]);
        }

        StringBuilder  sb = new StringBuilder("");
        Node curr = root;
        while(!curr.eow && curr.children ==1  ){
            
            for(int i=0;i<26;i++){
                if(curr.arr[i] != null){
                    char ch  =(char) (i+'a');
                    sb.append(ch);
                    curr = curr.arr[i];
                    break;
                }
            }
            
        }
         
         return sb.toString();

    }
}