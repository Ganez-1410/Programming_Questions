import java.util.*;
/*
You are given a set  S consisting of non-negative powers of three S{1,3,9,27,....} 
Consider the sequence of all non-empty subsets of S ordered by the value of the sum of their elements.
You are also given a single element n. 
You are required to find the subset at the  nth position in the sequence and print it in increasing order of its elements.

ip: 5
	1
	6
	11
	9
	19

op:1
	1 
	2
	3 9 
	3
	1 3 27 
	2
	1 27 
	3
	1 3 81
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class A_subset_in_a_sequence {
//	static void check(int n) {
//		String s="";
//		int c=0;
//		while(n>0) {
//			int p=(int) (Math.log(n)/Math.log(2));
//			 s=(int)Math.pow(3, p)+" "+s;
//			 n%=(int)Math.pow(2,p);
//			 c++;
//		}
//		System.out.println(c+"\n"+s);
//	}
//public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	int t=sc.nextInt();
//	while(t-->0) {
//	int n=sc.nextInt();
//	check(n);
//	}
//}
	
public static void main(String[] args) {
	//Scanner sc=new Scanner(System.in);
	FastReader f=new FastReader();
	int t=f.nextInt();
	long i=1;
	ArrayList<Long> a=new ArrayList<Long>();
	while(true) {
		if(i>1000000000000L)
			break;
		a.add(i);
		i*=3;
	}
	String s="";
	StringBuffer sb=new StringBuffer();
	while(t-->0) {
	long n=f.nextLong(),k=0;
		List<String> result=new ArrayList<String>();
		while(true) {
			long j=n/(int)Math.pow(2,k);
			if(j%2==1)
				result.add(String.valueOf(a.get((int)k)));
			if(j==0)
				break;
			k++;	
		}
		sb=sb.append(result.size()+"\n");
		s=String.join(" ",result);
		sb=sb.append(t==0?s:s+"\n");
		result.clear();
	}
	System.out.println(sb);
}
}
