import java.util.ArrayList;

public class Dup_char_in_String {
public static void main(String[] args) {
	String s="aggyowwc";
	ArrayList<Character> a=new ArrayList<Character>();
	for(int i=0;i<s.length();i++) {
		if(a.contains(s.charAt(i)))
			System.out.println(s.charAt(i));
		else
			a.add(s.charAt(i));
	}
}
}
