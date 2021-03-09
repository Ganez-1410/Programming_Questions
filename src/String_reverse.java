
public class String_reverse {
	static String rev(String s) {
		String st="";
		for(int i=s.length()-1;i>=0;i--)
			st+=s.charAt(i);
		return st;
		
	}
	static String revs(String s) {
		return new StringBuffer(s).reverse().toString();
	}
public static void main(String[] args) {
	System.out.println(rev("Ganesh")); // without using built-in function
	System.out.println(revs("Ganesh"));// using built-in function
}
}
