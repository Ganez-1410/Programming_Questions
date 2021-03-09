import java.util.Scanner;
import java.util.stream.*;
public class NineDivisors {
	static int check(int n) {
//		int c=0;
//		for(int i=1;i<=n;i++) {
//			if(n%i==0)
//				c++;
//		}
//		return c;
	return (int)IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count();
	}
public static void main(String[] args) {
	//int n=new Scanner(System.in).nextInt();
	String s="10101";
	//ArrayList<Integer> a=new ArrayList<Integer>();
	
//	for(int i=1;i<=n;i++) {
//		if(check(i)==9) {
//		//	a.add(i);
//			count++;
//		}
//	}
	//int c=(int)IntStream.rangeClosed(1, n).filter(i -> check(i)==9).count();
	//System.out.println(c);
}
}
