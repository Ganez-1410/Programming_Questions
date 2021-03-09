import java.util.*;
public class First_negative {
	static void check(int[] a,int n,int k) {
		//int n;
		//for(int i=0;i<(q.size()-k+1);i++) {
			 boolean flag=false;
			 for(int j=0;j<k;j++) {
			//	 if((n=q.poll())<0) {
					 System.out.println(n+" ");
					 flag=true;
					 break;
				 }
			 //}
			 if(!flag)
				 System.out.println("0"+" ");
				 
		}
	//}
public static void main(String[]args) {
	int[] a= {12, -1, -7 ,8 ,-15, 30, 16, 28};
	int k=3,n=a.length;
	Queue<Integer> q=new LinkedList<>();
	//Collections.addAll(q,a);
	check(a,n,k);
    Iterator i=q.iterator();
	while(i.hasNext())
		System.out.println(i.next()+" ");
	
}
}
