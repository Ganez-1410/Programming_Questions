import java.util.Scanner;

public class MinimizeCost_HCK {
	static long check(long k,long n,long[] a,long sum) {
		long sum1=0;
		long counter=0;
	    long m=k;
		for (int i=0;i<n;i++)
			if(a[i]>=0) {
			  counter+=1;
			  sum1+=a[i];
			  m=k;
	        }
	       else {
	    	 if(counter==0)
			     return Math.abs(sum+a[i]);
			 else {
	             m-=1;
			     if(m<0)
	                sum1+=Math.abs(a[i]);
			     else
	                sum1+=a[i];
			      }
		    }
	    return Math.abs(sum1);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	long n=sc.nextLong();
	long k=sc.nextLong(),sum=0;
	long[] a=new long[(int) n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextLong();
		sum+=a[i];
	}
	System.out.println(check(k,n,a,sum));
}
}
