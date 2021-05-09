import java.util.Scanner;

public class Task1 {
	static void	 print(char[] ch) {
		int first=0,last=ch.length-1;
		while(first<last) {
			if(ch[first]==' ') {
				first++;
				continue;
			}
			else if(ch[last]==' ') {
				last--;
				continue;
			}
			else {
				char t=ch[first];
				ch[first]=ch[last];
				ch[last]=t;
				first++;
				last--;
			}
		}
		for(char c:ch)
			System.out.print(c);
	}
public static void main(String[] args) {
	String s=new Scanner(System.in).nextLine();
	print(s.toCharArray());
}
}
