
public class Method_overloading {
	public int check(int a,int b) {
		return a+b;
	}
	public double check(double a,double b) {
		return Math.abs(a-b);
	}
public static void main(String[] args) {
	//System.out.println(args[1]);
	System.out.println("Main method...");
}
public static void main() {
	System.out.println("Method main...");
}
public static void main(int n) {
	System.out.println(n);
}
static {
	main();
	main(5);
	String[] s= {"abcde"};
	//main(s);
	Method_overloading m=new Method_overloading();
	System.out.println(m.check(2, 4));
	System.out.println(m.check(2, 4));
	System.out.println(m.check(20.5, 22));
	
}
}
