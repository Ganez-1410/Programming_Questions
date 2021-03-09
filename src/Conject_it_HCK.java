import java.math.BigInteger;
import java.util.Scanner;

public class Conject_it_HCK {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0) {
	BigInteger b=sc.nextBigInteger();
	while(b.compareTo(new BigInteger("0"))==1) {
		if(b.equals(new BigInteger("1"))) {
			System.out.println("YES");
			break;
		}
		if(b.mod(new BigInteger("2")).equals(new BigInteger("0"))) {
		b=b.divide(new BigInteger("2"));
			//System.out.println(b);
		}
		else {
			b=b.multiply(new BigInteger("3")).add(new BigInteger("1"));
			//System.out.println(b);
		}
		}
	if(!b.equals(new BigInteger("1")))
		System.out.println("NO");
}
}
}