class Solution 
{ 
    long getSubstringWithEqual012(String str) 
    { 
        // code here
         HashMap<String, Integer> map = new HashMap<>();
      map.put("0*0", 1);
      int[] c = {0,0,0};
      int ans = 0;
      for (int i = 0; i < str.length(); i++) {
          int n = str.charAt(i) - '0';
          c[n]++;
          String key = (c[0] - c[1]) + "*" + (c[1] - c[2]);
         if(map.containsKey(key))
         {
             ans=ans+map.get(key);
             map.put(key,map.get(key)+1);
         }
         else
         {
             map.put(key,1);
         }
      }
      return ans;
    }
} 