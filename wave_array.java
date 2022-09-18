class Solution {
    public static void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void convertToWave(int n, int[] a) {
        // code here
        for(int i=0;i<n-1;i=i+2){
            swap(a,i,i+1);
        }
    }
}
        
