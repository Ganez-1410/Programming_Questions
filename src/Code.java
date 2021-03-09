import java.util.Scanner;

public class Code {
public static void main(String[] args) {
	//int[] a=new int[] {9,0,4,2,0,1,0};
	Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),temp,first;
    int[] a=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
	//int temp,first;
	for(int i=0;i<a.length-1;i++) {
		if(a[i]==0) {
			first=a[i];
		for(int j=i;j<a.length-1;j++) {
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
		}
		a[a.length-1]=first;
	}
	}
	for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
}
}
