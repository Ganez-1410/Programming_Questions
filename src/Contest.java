import java.util.Arrays;
import java.util.Scanner;
public class Contest {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String st[]=s.split(" ");
	int[] a=new int[st.length/2];
	int k=0;
	for(int i=0;i<st.length;i+=2) {
		st[i]=st[i].toLowerCase();
		a[k++]=Integer.valueOf(st[i+1]);
	}
	Arrays.sort(a);
	Arrays.sort(st);
	for(int i=0;i<st.length/2;i++) {
		System.out.print(st[i+(st.length/2)]+" ");
		System.out.print(a[i]+" ");
	}
}
}
