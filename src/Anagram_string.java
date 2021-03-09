import java.util.Arrays;

public class Anagram_string {
	static boolean check(String a,String b) {
		if(a.length()!=b.length())
			return false;
		char[] c=a.toCharArray();
		char[] d=b.toCharArray();
		Arrays.sort(c);
		Arrays.sort(d);
		for(int i=0;i<a.length();i++) {
			if(c[i]!=d[i])
				return false;
		}
		return true;
	}
public static void main(String[] args) {
	String a="park";
	String b="akpr";
	System.out.println(check(a,b)?"Yes..Its anagram":"No..its not an anagram");
}
}
