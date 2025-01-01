package dsa_Practise;

public class SlidingWindow {

	public static void main(String[] args) {
		int current=0; int max,k=4 ;
		// TODO Auto-generated method stub
		int arr[]= {1, 4, 2, 10, 23, 3, 1, 0, 20};
		int n=arr.length;
		System.out.println(n);
		for (int i=0;i<=k-1;i++)
		{
			current=current+arr[i];
		}
		max=current;
		
		for(int i=1;i<=n-k;i++)
		{
		current=current -arr[i-1]+arr[k+i-1];//4 5
		if(current>max)
		{
			max=current;
		}
		
		
		
		
		

	}
		System.out.println(max);
		

	}
}
