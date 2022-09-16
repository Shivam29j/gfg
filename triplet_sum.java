class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int A[], int n, int X) { 
    
       // Your code Here
       Arrays.sort(A);
       for(int i=0;i<A.length-2;i++){
           int j=i+1,k=n-1;
           while(j<k){
               if(A[i]+A[j]+A[k]==X)
               return true;
               else if(A[i]+A[j]+A[k]>X)
               k--;
               else
               j++;
           }
       }
       return false;
    }
}
