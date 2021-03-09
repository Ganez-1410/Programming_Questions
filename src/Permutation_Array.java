import java.util.Arrays;
import java.util.TreeSet;

public class Permutation_Array {
	static String str[]= {"ab","ab","cd"};
	static TreeSet<String> t=new TreeSet<String>();
public static void main(String[] args) {
	String s="";
	for(int i=0;i<str.length;i++)
		s+=i;
	permut("",s);
	for(String st:t)
		System.out.println(st);
}
static void permut(String perm,String in) {
	if(in.length()==0) {
		String s=perm,st="";
		for(int i=0;i<s.length();i++) {
			st+=str[Integer.valueOf(s.charAt(i)+"")]+" ";
		}
		t.add(st.trim());
	}
	else {
		for(int i=0;i<in.length();i++)
			permut(perm+in.charAt(i),in.substring(0,i)+in.substring(i+1));
	}
}
}
