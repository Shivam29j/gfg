class Solution {
    boolean areKAnagrams(String s1, String s2, int k) {
        // code here
        if(s1.length()!=s2.length()){
            return false;
        }
        Map<Character,Integer> map=new HashMap<>();
        int total=0;
        for(int i=0;i<s1.length();i++){
        map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
        }
        for(char a:s2.toCharArray()){
            if(map.containsKey(a) && map.get(a)>0){
             map.put(a, map.getOrDefault(a,0)-1);
            }
        }
       for(int i:map.values()){
           total+=i;
       }
       if(total<=k){
           return true;
       }else{
           return false;
       }
    }
}