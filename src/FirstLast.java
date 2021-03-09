
public class FirstLast {
	static boolean isvowel(int c) {
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            return true;
        return false;
	}
public static void main(String[] args) {
	int n=3;
	String s="";
	String str[]= {"oreo","sirish","apple"};
	for(int i=0;i<n;i++) {
		if(isvowel(str[i].charAt(0))&&isvowel(str[i].charAt(str[i].length()-1)))
			s+=str[i];	
	}
	System.out.println(s.toLowerCase());
}
}
