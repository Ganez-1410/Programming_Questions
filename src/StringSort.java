import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class StringSort {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=12;//sc.nextInt();
	String s="defRTSersUXI";//sc.next();
	ArrayList<Character> t1=new ArrayList<Character>();
	ArrayList<Character> t2=new ArrayList<Character>();
	for(int i=0;i<n;i++) {
		if(Character.isLowerCase(s.charAt(i))) 
			t1.add(s.charAt(i));
		else
			t2.add(s.charAt(i));
	}
	Collections.sort(t1);
	Collections.sort(t2);
	int k1=0,k2=0;
	String st="";
	for(int i=0;i<n;i++) {
		if(Character.isLowerCase(s.charAt(i)))
			st+=t1.get(k1++);
		else
			st+=t2.get(k2++);
	}
	System.out.println(st);
}
}
