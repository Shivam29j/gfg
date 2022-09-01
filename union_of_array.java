class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        HashSet<Integer> h=new HashSet<Integer>();
        for(int i=0;i<n;i++){
            h.add(a[i]);
        }
        for(int j=0;j<m;j++){
            h.add(b[j]);
        }
        return h.size();
    }
}