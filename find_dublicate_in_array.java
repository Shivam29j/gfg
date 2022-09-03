class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j] && i!=j){
                    System.out.println("arr[i]");
                }
            }
        }
        return arr[i];
    }
}