import java.util.Scanner;

public class Task6 {
public static void main(String[] args) {
	String s=new Scanner(System.in).nextLine();
	for(int i=0;i<s.length();i++) {
		int x=(int)(s.charAt(i));
		int k=x+26;
		x=2*(x-64)-1;
		System.out.print((char)(k-x));
		
	}
}
}
