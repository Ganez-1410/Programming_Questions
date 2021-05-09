
public class CharacterSequence {
public static void main(String[] args) {
	String s="ab10b2c14",alp="",num="";
	for(int i=0;i<s.length();i++) {
		alp="";
		num="";
		while(i<s.length() && Character.isAlphabetic(s.charAt(i))) {
			alp+=s.charAt(i);
			i++;
		}
		while(i<s.length() && Character.isDigit(s.charAt(i))) {
			num+=s.charAt(i);
			i++;
		}
		for(int j=0;j<(Integer.valueOf(num));j++)
			System.out.print(alp);
		i--;
	}
}
}
