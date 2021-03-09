import java.util.Scanner;
public class Rough3 {
public static void main(String[] args) {
	//String s="this phrase has multiple words";
	String s="can you not do that?";
	//String s="the longest word in the dictionary is..."; 
	String st[]=s.split(" ");
	float l=0f;
	for(String sr:st) 
		l+=sr.length();
	System.out.println(l);
	System.out.println(st.length);
	double f;
	System.out.println(f=l/st.length);
	System.out.println((String.valueOf(l/st.length).charAt(String.valueOf(l/st.length).indexOf(".")+1))>=5?(int)Math.ceil(l/st.length):(int)Math.floor(l/st.length));
	//System.out.println(((l/st.length)>=5)?(int)Math.ceil(l/st.length):(String.valueOf(l/st.length).charAt(String.valueOf(l/st.length).indexOf(".")+1))>=5?(int)Math.ceil(l/st.length):(int)Math.floor(l/st.length));
}
}