import java.util.ArrayList;

public class FirstNon_repeated_Char {
public static void main(String[] args) {
	String s="abddvsj";
	int j;
	for(int i=0;i<s.length()-1;i++) {
		for( j=i+1;j<s.length();j++) {
		  if(s.charAt(i)!=s.charAt(j) && s.charAt(i)!=s.charAt(i-1) && i>0) {
			System.out.println(s.charAt(i));
			break;
		}
	}
		if(j!=s.length())
			  break;
	}
}
}
