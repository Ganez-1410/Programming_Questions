import java.math.BigInteger;
import java.util.*;
public class BigIntegerFibonacci {
	static BigInteger fibo(BigInteger a,BigInteger b,BigInteger c) {
		if(c.equals(new BigInteger("1")))
			return a;
		if(c.equals(new BigInteger("2")))
			return b;
		BigInteger count=new BigInteger("0");
		for(BigInteger i=new BigInteger("3");i.compareTo(c)<=0;i=i.add(new BigInteger("1"))) {
			count=a.add(b);
			a=b;
			b=count;
		}
		return count;
	}
public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in); 
//	System.out.println(fibo(sc.nextBigInteger(),sc.nextBigInteger(),sc.nextBigInteger()));
	List<Integer> l=new LinkedList<>();
	l.add(new BigInteger("12674140923856029586025364050").intValue());
	l.add(new BigInteger("952036502050037602503405643050").intValue());
	System.out.println(l);
}
}
