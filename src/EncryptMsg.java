import java.util.Scanner;

public class EncryptMsg {
	public static void main(String args[] ) {
		Scanner sc = new Scanner(System.in);
	String s=sc.next();
	int n=sc.nextInt();
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(Character.isLetter(ch)){
			int l=ch;
			if(l>=97 && l<=122){
				l=l-97+n;   l=l%26;  l=l+97;
				System.out.print((char)l);
				}
			else {
				l=l-65+n;  l=l%26;  l=l+65;
				System.out.print((char)l);
				}
			}
	else if(Character.isDigit(ch)){
		int h=Character.getNumericValue(ch)+n;
		System.out.print(h%10);
		}
	else{
	System.out.print(ch);
	}
		}
	}
}

