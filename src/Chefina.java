import java.util.ArrayList;

public class Chefina {
public static void main(String[] args) {
	ArrayList<ArrayList<Object>> arr=new ArrayList<>();
	ArrayList<Object> a=new ArrayList<>();
	a.add(1);
	a.add('a');
	arr.add(a);
	System.out.println(a);
	System.out.println(arr);
	a.clear();
	a=new ArrayList<>();
	a.add(3);
	a.add('c');
	arr.add(a);
	System.out.println(a);
	System.out.println(arr);
}
}
