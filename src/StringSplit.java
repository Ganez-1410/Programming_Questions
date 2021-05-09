
public class StringSplit {
	static String split(String s,int key) {
		StringBuilder sb=new StringBuilder(s);
		for(int i=0;i<s.length();i++) {
			int ch=(s.charAt(i)-64)+key;
			if(ch>26)
				sb=sb.replace(i, i+1,String.valueOf(ch%26).charAt(0)+"");
			else
				sb=sb.replace(i, i+1,((char)(64+ch))+"");
		}
		sb=sb.reverse();
		String odd="",even="";
		for(int i=0;i<sb.length();i++) {
			if(i%2==0)
				even+=sb.charAt(i);
			else
				odd+=sb.charAt(i);
		}
		return key%2==0?(even+odd):(odd+even);
	}
public static void main(String[] args) {
	System.out.println(split("ABCDEF",7));
}
}
