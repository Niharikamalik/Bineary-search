public class Main
{
	public static void main(String[] args) {
		int arr[] ={10,20,40,50,69,89,99};
		int n = 7;
		int x = 69;
		System.out.println(Bsearch(arr,n,x));
 	}
 	public static int Bsearch(int arr[],int n,int x){
 	    int low =0,high=n-1;
 	   
 	    while(low<=high){
 	        int mid = (low+high)/2;
 	        if(arr[mid]==x)
 	        return mid ;
 	        else if(arr[mid]<x)
 	        low = mid+1;
 	        else high = mid-1;
 	    }
 	    return -1;
 	  
 	  
 	}
}
