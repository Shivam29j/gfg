static int solve(int n, int[] nums, int k){
int freq=0;
for(int i=0;i<nums.length;i++){
    if(nums[i]==k){
        freq++;
    }
}
return freq;
}