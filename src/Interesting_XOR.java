import java.util.Scanner;

public class Interesting_XOR {
	static int powerTwo(int c) {
		int k=2;
		while(true) {
			k*=2;
			if(c<k)
				break;
		}
		return k;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	while(n-->0) {
		int c=sc.nextInt();
	int pow=powerTwo(c),max=0,pro=0;
	for(int a=pow-1;a>0;a--) {
		int b=c^a;
		if(b<pow) {
			pro=a*b;
		}
		if(max < pro)
			max=pro;
	}
	System.out.println(max);
	}
}
	
	} 

