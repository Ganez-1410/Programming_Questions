abstract class Ab{
	Ab(){
		System.out.println("Abstract class constructor...");
	}
//	abstract void method();
	//abstract int method1();
    void cl(){
		System.out.println("normel method...");
	}
	static void sta() {
		System.out.println("static method...");
	}
	final void fi() {
		System.out.println("final method...");
	}
	
}
public class Abstract_class extends Ab{
	Abstract_class(){
		System.out.println("class constructor...");
	}
	void method() {
		System.out.println("abstract method...");
	}
	int method1() {
		return 10;
	}
public static void main(String[] args) {
	Abstract_class a=new Abstract_class();
	a.method();
	a.cl();
	a.fi();
	Ab.sta();
	System.out.println(a.method1());
	a.sta();	
}
}
