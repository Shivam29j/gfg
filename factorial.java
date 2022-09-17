class Solution {
    static ArrayList<Integer> factorial(int N){
        //code here
        ArrayList<Integer> ans = new ArrayList<>();
        int fact=1;
        for(int i=1;i<=N;i++){
            fact=fact*i;
        }
        ans.add(fact);
        return ans;
    }
}