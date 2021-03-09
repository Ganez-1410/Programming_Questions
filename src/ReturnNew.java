
public class ReturnNew {
	static String New(String input1) {
		String st="";
		String str[]=input1.split(" ");
		for(int i=0;i<str.length;i++) {
			int n=str[i].length();
			for(int j=0;j<n;j++) 
				st+=(char)(str[i].charAt(j)+n);
			st+=" ";
		}
		return st;
	}
public static void main(String[] args) {
	String s="Hi Hell";
	System.out.println(New(s));
	
	
}
}
