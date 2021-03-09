import java.util.Scanner;

public class ReverseString_digits {
public static void main(String[] args) {
/*	ip:"JavaCode2017Contest";
	op:"JavaCode7102Contest"  */
	String s=new Scanner(System.in).next();
	String d="";
	for(int i=0;i<s.length();i++) {
		if(Character.isDigit(s.charAt(i)))
			d+=s.charAt(i);
	}
	int k=d.length()-1;
	for(int i=0;i<s.length();i++) {
		if(Character.isDigit(s.charAt(i)))
			System.out.print(d.charAt(k--));
		else
		   System.out.print(s.charAt(i));
	}
}
}
