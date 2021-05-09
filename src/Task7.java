import java.util.Scanner;

public class Task7 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int m=sc.nextInt(),n=sc.nextInt();
	int[][] arr=new int[m][n];
	for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++)
			arr[i][j]=sc.nextInt();
	}
	int c=0;
	for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++) {
			if(arr[i][j]==1) {
				int k=j+1;
				while(k<n) {
					if(arr[i][k]!=0)
						break;
					k++;
				}
				if(k!=n)
					break;
				k=i+1;
				while(k<n) {
					if(arr[k][j]!=0)
						break;
					k++;
				}
				if(k!=n)
					break;
				k=j-1;
				while(k>=0) {
					if(arr[i][k]!=0)
						break;
					k--;
				}
				if(k!=-1)
					break;
				k=i-1;
				while(k>=0) {
					if(arr[k][j]!=0)
						break;
					k--;
				}
				if(k!=-1)
					break;
				c++;
			}
		}
	}
	System.out.println(c);
}
}
