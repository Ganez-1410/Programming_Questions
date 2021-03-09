import java.util.*;
public class Zoo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[] a=new int[3];
	int[] b=new int[3];
	int[] c=new int[2];
	int[] d=new int[2];
	int[] e=new int[2];
	int x,big=Integer.MIN_VALUE,small=Integer.MAX_VALUE,m=0,n=0;
	for(int i=0;i<3;i++)
		a[i]=sc.nextInt();
	for(int i=0;i<3;i++)
		b[i]=sc.nextInt();
	for(int i=0;i<2;i++)
		c[i]=sc.nextInt();
	for(int i=0;i<2;i++)
		d[i]=sc.nextInt();
	for(int i=0;i<2;i++)
		e[i]=sc.nextInt();
	x=sc.nextInt();
	for(int i=0;i<3;i++) {
		if(big<a[i]) {
			big=a[i];
			m=i;
		}
		if(small>a[i]) {
			small=a[i];
			n=i;
		}
	}
	int y;
	x-=b[n];
	if(m==0)
		y=c[0]*c[1];
	else if(n==1)
		y=d[0]*d[1];
	else
		y=e[0]*e[1];
	x-=y;
	System.out.println(b[n]*a[n]+y*a[m]+x*a[n+m<3?(3-(n+m)):3]);
}
}
