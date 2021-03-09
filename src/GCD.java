import java.util.Scanner;

public class GCD {
	static int gcd(int a,int b) {
		if(a==0)
			return b;
		return gcd(b%a,a);
	}
	static int check(int[] a,int n) {
		int res=0;
		for(int i=0;i<n;i++) {
			res=gcd(res,a[i]);
			if(res == 1)
				return 1;
		}
		return res;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt(),mul=1;
	int[] a=new int[n];
	for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
	for(int i:a)
		mul*=i;
	System.out.println(((int)Math.pow(mul,check(a,n)))%1000000007);
}
}
