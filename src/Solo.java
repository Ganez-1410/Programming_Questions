
public class Solo {
public static void main(String[] args) {
	String s="3 i need 2 pumpkins and 3 apples",st="";
	char c[]=s.toCharArray();
	for(int i=0;i<c.length;i++) {
		if(Character.isDigit(c[i])) {
			switch(c[i]) {
			case '0':st=st+"zero";
		       break;
			case '1':st=st+"one";
		       break;
			case '2':st=st+"two";
		       break;
			case '3':st=st+"three";
		       break;
			case '4':st=st+"four";
		       break;
			case '5':st=st+"five";
		       break;
			case '6':st=st+"six";
		       break;
			case '7':st=st+"seven";
		       break;
			case '8':st=st+"eight";
		       break;
			case '9':st=st+"nine";
		       break;   
		       
			}
		}
		else
		st=st+c[i];
	}
	System.out.println(st);
}
}
