import java.util.Scanner;

public class Leader {
	public void talk() {
		
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt(),j;
	int[] a=new int[n];
	for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
    for(int i=0;i<n-1;i++) {
    	for(j=i+1;j<n;j++) {
    		if(a[i]<a[j])
    			break;
    	}
    	if(j==n)
    		System.out.print(a[i]+" ");
    }
    System.out.println(a[a.length-1]);
}
}
