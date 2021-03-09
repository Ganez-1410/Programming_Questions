import java.util.Scanner;

public class BestIndex_HCK {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
	long max=Integer.MIN_VALUE;
	for(int i=0;i<n-1;i++) {
		long sum=0;
		int left=n-i;
		int vo=1;
		int k=i;
		while(left>0) {
			for(int j=0;j<vo;j++) 
				sum+=(long)a[k++];
		vo++;
		left-=vo;
		}
		if(max<sum) 
			max = sum;
	}
	System.out.println(max);
	sc.close();
}
}
