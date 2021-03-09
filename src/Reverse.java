
public class Reverse {
public static void main(String[] args) {
	String s="ab,d$w";
	char[] c=s.toCharArray();
	System.out.println(c.length-1);
	int start=0,end=c.length-1;
	while(start<end) {
		if(!Character.isAlphabetic(c[start]))
			start++;
		if(!Character.isAlphabetic(c[end]))
			end--;
		if(Character.isAlphabetic(c[start])&&Character.isAlphabetic(c[end])) {
			char ch=c[start];
			c[start]=c[end];
			c[end]=ch;
			start++;
			end++;
		}
	}
	System.out.println(String.valueOf(c));
}
}
