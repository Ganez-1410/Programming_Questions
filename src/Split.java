import java.util.Scanner;
/*
 * input:1 2 3 1 0 2 3
 * output: true
 * 
 * Explanation:using space(" ")to split the half and some its right and left is equals na
 * print true
 * otherwise false 
 * 
 */
public class Split {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String s="";
	for(int i=0;i<n;i++) {
		s+=String.valueOf(sc.nextInt());
	    s+=" ";
	}
	int sum,sum1;
	String[] st=s.split(" ");
	for(int i=0;i<n;i++) {
		sum=0;
		sum1=0;
		for(int j=0;j<n;j++) {
		   if(j>i)
			   sum+=Integer.valueOf(st[j]);
		   else 
			   sum1+=Integer.valueOf(st[j]);
		}
		if(sum==sum1) {
			System.out.println("True");
			System.exit(0);
		}
	}
	System.out.println("False");
}
}
