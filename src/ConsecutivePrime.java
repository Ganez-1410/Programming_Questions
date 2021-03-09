import java.util.Scanner;
public class ConsecutivePrime {
	static boolean isPrime(long n) {
		long flag=1;
		for(long i=2;i<n;i++) {
			if(n%i==0)
				flag=0;
		}
		if(flag==1)
			return true;
		return false;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	long n=sc.nextLong();
	long flag,sum=2,count=0;
	for(long i=3;i<=n;i++) {
		flag=1;
		for(long j=2;j<i;j++) {
			if(i%j==0)
				flag=0;
		}
		if(flag==1) {
			sum+=i;
			if(isPrime(sum)&&sum<=n)
				count++;
		}
	}
	System.out.println(count);
}
}
