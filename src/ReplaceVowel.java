//jothiprakash.v@kce.ac.in
public class ReplaceVowel {
	static String transform(String s) {
		StringBuilder sb=new StringBuilder(s);
		boolean flag=false;
		for(int i=0;i<sb.length();i++) {
			char ch=sb.charAt(i);
			if(ch=='a' || ch=='e' ||ch=='i' || ch=='A' || ch=='E' ||ch=='I') {
				flag=true;
				String k=String.valueOf(i+(Character.toLowerCase(ch)-96));
				if(k.length()==1)
					sb.setCharAt(i,k.charAt(0));
				else {
					int sum=0;
					for(int j=0;j<k.length();j++)
						sum+=Integer.valueOf(k.charAt(j)+"");
					sb.setCharAt(i,String.valueOf(sum).charAt(0));
				}
			}
		}
		return !flag?"-1":sb.toString();
	}
public static void main(String[] args) {
	String s="Live and Let Live";
	System.out.println(transform(s));
}
}
