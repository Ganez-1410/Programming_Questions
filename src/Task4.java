import java.util.Scanner;

public class Task4 {
public static void main(String[] args) {
	int n=new Scanner(System.in).nextInt(),max=Integer.MIN_VALUE;
	String s=Integer.toBinaryString(n),st="",fin="";
	System.out.println(s);
	for(int i=0;i<s.length()-1;i++) {
		if(s.substring(i,i+2).equals("10")) {
			int k=i+2;
			st="10";
			while(k<s.length()-1) {
				if(s.substring(k,k+2).equals("10"))
					st+="10";
				else 
					break;
				k+=2;
			}
			if(max<st.length()) {
				fin=st;
				max=st.length();
			}
			i=k;
		}
		else if(s.substring(i,i+2).equals("01")) {
			int k=i+2;
			st="01";
			while(k<s.length()-1) {
				if(s.substring(k,k+2).equals("01"))
					st+="01";
				else 
					break;
				k+=2;
			}
			if(max<st.length()) {
				fin=st;
				max=st.length();
			}
			i=k;
		}
	}
	System.out.println(fin);
}
}
