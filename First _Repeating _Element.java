class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) {
        // Your code here
        Map<Integer, Integer> map = new HashMap<>();
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) {
                ans = Math.min(map.get(arr[i]), ans);
            }
            else {
                map.put(arr[i], (i+1));
            }
        }
        if(ans == Integer.MAX_VALUE) {
            return -1;
        }
        return ans;