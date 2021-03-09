import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class SetMenuDriven {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	while(T-->0) {
		int n=sc.nextInt();
		TreeSet<Integer> t=new TreeSet<Integer>();
		while(n-->0) {
		char c=sc.next().charAt(0);
		if(c=='a') {
			t.add(sc.nextInt());
		}
		else if(c=='b') {
			Iterator i=t.iterator();
			while(i.hasNext())
				System.out.print(i.next()+" ");
		}
		else if(c=='c')
			t.remove(sc.nextInt());
		else if(c=='d') {
			if(t.contains(sc.nextInt()))
				System.out.print(1+" ");
			else
				System.out.print(-1+" ");
		}
		else if(c=='e')
			System.out.print(t.size()+" ");
		}
		System.out.println();
	}
}
}
