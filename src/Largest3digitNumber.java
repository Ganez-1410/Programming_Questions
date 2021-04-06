import java.util.*;
public class Largest3digitNumber {
public static void main(String[] args) {
	String s=new Scanner(System.in).nextLine();
	int k=Integer.MIN_VALUE;
	for(int i=0;i<s.length()-2;i++) {
		int x=Integer.valueOf(s.substring(i,i+3));
		if(x%2==1) {
			if(k<x)
				k=x;
		}
	}
		System.out.println(k);
}
}
