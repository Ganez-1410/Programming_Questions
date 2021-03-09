import java.util.Scanner;
abstract class Figure{
	double x,y;
	Figure(double a,double b){
		x=a;
		y=b;
	}
	abstract void area();
}
class Circle extends Figure{
	Circle(double a,double b){
		super(a,b);
	}
	void area() {
		System.out.println("Area of the circle:"+x*y/2);
	}
}
class Rectangle extends Figure{
	Rectangle(double a,double b){
		super(a,b);
	}
	void area() {
		System.out.println("Area of the Reactangle:"+x*y);
	}
}
public class ClosestValue {
public static void main(String[] args) {
//	int a[]=new int[7];
//	Scanner sc=new Scanner(System.in);
//	for(int i=0;i<a.length;i++)
//		a[i]=sc.nextInt();
//	int t=sc.nextInt();
//	while(t-->0) {
//	int n=sc.nextInt(),max=Integer.MAX_VALUE,m=0;
//	for(int i=0;i<a.length;i++) {
//		if(Math.abs(n-a[i])<=max) {
//			max=Math.abs(n-a[i]);
//			m=i;
//		}
//	}
//	System.out.println(a[m]);
//	}
	Circle c=new Circle(4,8);
	Rectangle r=new Rectangle(2,4);
	Figure f;
	f=c;
	f.area();
	f=r;
	f.area();
}
}