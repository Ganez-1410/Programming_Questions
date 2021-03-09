class A{
	void check() {
		System.out.println("Parent...");
	}
}
class B extends A{
	void check() { //over riding method
		System.out.println("child...");
	}
	 int check(int n) { //over loading method
		return n;
	}
}
public class Method_overriding {
public static void main(String[] args) {
	B b=new B();
	b.check();
	System.out.println(b.check(5));
	A a=new A();
	a.check();
}
}
