import java.util.Scanner;

public class Aman_Sharma_HCK {
public static void main(String[] args) {
	//Scanner sc=new Scanner(System.in);
	FastReader sc=new FastReader();
	int t=sc.nextInt(),count=0;
	while(t-->0) {
		int a=sc.nextInt(),b=sc.nextInt();
		if((b*100)>(2*(22/7)*a))
			count++;
	}
	System.out.println(count);
}
}
