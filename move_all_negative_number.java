class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
           int temp[] = new int[n];
       int low = 0, high = n - 1;
       for(int i=0;i<n;++i) {
           if(arr[i] >= 0) {
               temp[low] = arr[i];
               ++low;
           }
           else {
               temp[high] = arr[i];
               --high;
           }
       }
       int k = 0;
       for(;k<low;++k) {
           arr[k] = temp[k];
       }
       for(int i=n-1;i>=low;--i) {
           arr[k] = temp[i];
           ++k;
       }    
    }
}