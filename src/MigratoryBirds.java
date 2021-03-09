import java.util.*;
public class MigratoryBirds {
	static int check(List<Integer> arr) {
		int[] c=new int[10];
		for(int i=0;i<arr.size();i++)
			c[arr.get(i)]++;
		int k=c[0],j=0;
		for(int i=1;i<c.length;i++) {
			if(c[i]>k) {
				k=c[i];
				j=i;
			}
		}
		return j;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	List<Integer> l=new LinkedList<>();
	for(int i=0;i<n;i++)
		l.add(sc.nextInt());
	System.out.println(check(l));
}
}
