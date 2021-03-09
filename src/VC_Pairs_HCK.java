import java.util.Scanner;

public class VC_Pairs_HCK {
	static int check(String s,int n) {
		int count=0;
		for(int i=0;i<n-1;i++) {
			char c=s.charAt(i); 
			if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u') {
					char ch=s.charAt(i+1);
					if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
						count++;
			}
		}
		return count;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0) {
	int n=sc.nextInt();
	sc.nextLine();
	String s=sc.nextLine();
	System.out.println(check(s,n));
	}
}
}
