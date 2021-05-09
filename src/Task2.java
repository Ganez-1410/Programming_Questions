import java.util.Scanner;

public class Task2 {
	static void swap(int[] arr,int n,int l,int r) {
		l=l-1;
		r=r-1;
		while(l<r) {
			int t=arr[l];
			arr[l]=arr[r];
			arr[r]=t;
			l++;
			r--;
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] arr=new int[n];
	for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
	int l=sc.nextInt(),r=sc.nextInt();
	swap(arr,n,l,r);
	for(int i:arr)
		System.out.print(i+" ");
}
}
