
public class VowelSubstring {
	public static boolean isVowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            return true;
        return false;
    }
public static void main(String[] args) {
	String s="qwdftr",str="";
	int k=2,max=Integer.MIN_VALUE,count=0,i;
	
	for(i=0;i<=s.length()-k;i++) {
		String st=s.substring(i,i+k);
		int c=0;
		for(int j=0;j<st.length();j++) {
			if(isVowel(st.charAt(j))){
				c++;
			}
		}
		if(c==0)
			count++;
		if(max<c) {
			max=c;
			str=st;
		}
	}
	System.out.println(count==i?"Not found!":str);
}
}
