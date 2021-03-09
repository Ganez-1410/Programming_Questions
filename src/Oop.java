class Par extends Object{
}
class Park extends Par{
}
class Parks extends Park{
}
public class Oop {
public static void main(String[] args) {
	Par p1=new Par();
	Park p2=new Park();
	Parks p3=new Parks();
	System.out.println(p1 instanceof Park);
	Sal(p1);
	Sal(p2);
	Sal(p3);
}
	public static void Sal(Object ob) {
		if(ob instanceof Par)
			System.out.println("Par");
		else if(ob instanceof Park)
			System.out.println("Park");
		else if(ob instanceof Parks)
			System.out.println("Parks");
	}
}
