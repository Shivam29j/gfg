class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        //Write your code here
       long min=a[0];
       long max=a[0];
       for(int i=0;i<n;i++){
           if(a[i]<min){
               min=a[i];
           }
           if(a[i]>max){
               max=a[i];
           }
       }
       return (new pair(max,min));
    }
}
