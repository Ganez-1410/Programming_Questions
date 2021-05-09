import java.util.Stack;

public class Decoder{
public static void main(String[] args) {
	String s="3[2[a]3[bc]]";
	Stack<Character> st=new Stack<>();
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch==']') {
			ch=st.pop();
			StringBuilder sb=new StringBuilder("");
			while(ch!='[') {
				sb.insert(0,ch+"");
				ch=st.pop();
			}
			int k=Integer.valueOf(String.valueOf(st.pop()+""));
			while(k-->0) {
				for(int j=0;j<sb.length();j++)
				st.push(sb.charAt(j));
			}
		}
		else
			st.push(s.charAt(i));
	}
	for(Character c:st)
		System.out.print(c);
	//System.out.println("\naabbcbcaaabccabbcbcaaabcczaabbcbcaaabccabbcbcaaabcczaabbcbcaaabccabbcbcaaabccz");
}
}
