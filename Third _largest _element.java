class Solution
{
    int thirdLargest(int a[], int n)
    {
	    Arrays.sort(a);
	    ArrayList<Integer> h=new ArrayList<>();
	    for(int i=0;i<a.length;i++){
	        if(!h.contains(a[i])){
	            h.add(a[i]);
	        }
	    }
	        if(h.size()<=2){
	            return -1;
	        }
	        else if(h.size()==3){
	            return h.get(2);
	        }
	    
	        return h.get(h.size()-3);
	  
	    }
    
}
