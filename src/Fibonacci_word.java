import java.util.Scanner;

public class Fibonacci_word {
	static String fun(int n) {
		String a="0";
		String b="1";
		String c="";
		if(n==0)
			return a;
		for(int i=2;i<=n;i++) {
			c=b;
			b+=a;
			a=c;
		}
		return b; 
	}
	static int check(String s,String n) {
		if(s.length()<n.length())
			return 0;
		int count=0;
		for(int i=0;i<=s.length()-n.length();i++) {
			if(s.substring(i,n.length()+i).equals(n)) 
				count++;
		}
		return count;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println(check(fun(sc.nextInt()),sc.next()));
}
}
