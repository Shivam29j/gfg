class Solution
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int N)
	{
	   // add your code here
	   int count=1;
	   int max = Integer.MIN_VALUE;
	   Arrays.sort(arr);
	   for(int i=1;i<arr.length;i++){
	       if(arr[i]==arr[i-1]){
	           continue;
	       }
	       else if( arr[i]==arr[i-1]+1){
	           count++;
	       }
	       else{
	           max = Math.max(count, max);
	           count = 1;
	       }
	   }
	   return Math.max(count, max);
	}
}