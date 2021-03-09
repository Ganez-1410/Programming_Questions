import java.math.BigInteger;
import java.util.Scanner;

public class Series {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	long t=sc.nextInt();
	while(t-->0) {
	BigInteger b=sc.nextBigInteger();
	System.out.println(b.pow(3).add(b));
	}
}
}
