class Solution
{
    public String multiplyStrings(String s1,String s2)
    {
        //code here.
        BigInteger n1=new BigInteger(s1);
       BigInteger n2=n1.multiply(new BigInteger(s2));
        return String.valueOf(n2);
    }
}