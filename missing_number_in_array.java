class Solution {
    int MissingNumber(int array[], int n) {
        // Your Code Here
        int sum=0;
        int count=1;
        for(int i=0;i<array.length;i++){
            sum=sum+count;
            sum=sum-array[i];
            count++;
        }
        return sum+count;
    }
}