import java.util.Scanner;

public class Split_string_into_balanced {
	static int check(char[] c) {
		int count=0,a=0,b=0;
		for(int i=0;i<c.length;i++) {
			if(c[i]=='R')
				a++;
			if(c[i]=='L')
				b++;
			if(a==b) {
				a=0;
				b=0;
				count++;
			}
		}
		return count;
	}
public static void main(String[] args) {
	System.out.println(check(new Scanner(System.in).next().toCharArray()));
}
}
