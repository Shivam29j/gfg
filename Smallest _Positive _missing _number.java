class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        Arrays.sort(arr);
        int i = 0;
            while(i<arr.length && arr[i]<1){
                i++;
            }
            int missingNumber=1;
            for(int idx = i; idx < size; idx++) {
                if(idx < size-1 && arr[idx] == arr[idx+1]) continue;
                if(arr[idx]==missingNumber){
                 missingNumber= missingNumber+1;
                }
                else{
                    break;
                }
            }
        return  missingNumber;
    }
}
