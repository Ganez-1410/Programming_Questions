import java.util.Scanner;

public class ArithmeticProgression {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt(),co;
	while(t-->0) {
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int k=((2*b)-(a+c));
		co=k<0?k*=-1:k;
		System.out.println((co%2==0)?co/2:co/2+1);
	}
}
}
