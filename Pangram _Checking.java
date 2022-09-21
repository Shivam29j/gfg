class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String str) {
        // your code here
       HashSet<Character> h=new HashSet<>();
       for(int i=0;i<str.length();i++){
           if(str.charAt(i)>='a' && str.charAt(i)<='z'){
           h.add(str.charAt(i));
           }
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
            h.add(str.charAt(i));
            }
       }
           if(h.size()!=26){
           return false;
           }
       
       return true;
    }
}