
public class Noo {
	public static void main(String[] args) {
//		float f=1.2f;
//		byte b=1;
//		double d=1.5d;
//		int i=017;
//		System.out.println(i);
//		System.out.println(d);
//		System.out.println(f);
//	    System.out.println(b);
      String s="day fyyyz";
      System.out.println(check(s));
      //boolean b=s.contains("bob");
	   }
	static int check(String str) {
	//String s[]=str.split(" ");
	int c=0;
	for(int i=0;i<str.length();i++) {
		if((str.charAt(i)=='y'||str.charAt(i)=='z')&&Character.isLetter(str.charAt(i-1))) {
			if(i+1==str.length()-1||!Character.isLetter(str.charAt(i+1)))
			c++;
		}
	}
	return c;
  }
}