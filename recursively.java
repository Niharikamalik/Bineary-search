public class Main
{
	public static void main(String[] args) {
		int arr[] ={10,20,40,50,69,89,99};
		int n = 7;
		int x = 69;
		System.out.println(Bsearch(arr,0,n-1,x));
 	}
 	public static int Bsearch(int arr[],int low,int high,int x){
 	   if(low > high) return -1;
 	   int mid = (high+low)/2;
 	   if(arr[mid]==x)return mid;
 	   else if(arr[mid]<x) return Bsearch(arr,mid+1,high,x);
 	   else return Bsearch(arr,low,mid-1,x);
 	  
 	  
 	}
}
