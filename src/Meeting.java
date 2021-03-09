import java.util.Arrays;
import java.util.Scanner;

public class Meeting {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt(),sum=0,flag=1,count=0,j;
	int k=sc.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
	while(n>2){
		count++;
		if(count==1)
		  sum=1*a[0]+2*a[1];
		int[] b=new int[n-=1];
		//System.out.println(b.length);
		System.arraycopy(a,2,b,0,b.length-1);
//		for(int i=0;i<b.length;i++)
//			System.out.println(b[i]);
		b[b.length-1]=sum;
		Arrays.sort(b);
		for(j=0;j<b.length;j++) {
			if(b[j]<k) 
				break;
		}
		if(j==b.length) {
			flag=0;
			break;
		}
		sum=1*b[0]+2*b[1];
	}
	if(flag==0)
		System.out.println(count);
	else
		System.out.println(-1);
}
}
