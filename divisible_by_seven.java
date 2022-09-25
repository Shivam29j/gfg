class Solution{
    int isdivisible7(String num){
        // code here
        int rem=0;
        for(int i=0;i<num.length();i++)
        {
            rem=((rem*10)+(num.charAt(i)-'0'))%7;
        }
        return rem==0?1:0;
    }
}