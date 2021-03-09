import java.util.Scanner;

public class CollisionCourse {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[][] arr=new int[n][3];
	for(int i=0;i<n;i++) {
		arr[i][0]=sc.nextInt();
		arr[i][1]=sc.nextInt();
		arr[i][2]=sc.nextInt();
	}
	float[] dis=new float[n];
	for(int i=0;i<n;i++)
		{
		int x=arr[i][0]*arr[i][0];
		int y=arr[i][1]*arr[i][1];
		dis[i]=(float) Math.sqrt(x+y);
		}
	int count=0;
	for(int i=0;i<n-1;i++)
		{
		 for(int j=i+1;j<n;j++)
	       {
			 if(dis[i]/arr[i][2]==dis[j]/arr[j][2])
				 count++;
	       }
	    }
	System.out.println(count);
}
}
