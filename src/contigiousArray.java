import java.util.*;

public class contigiousArray {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
              arr[i]=sc.nextInt();
            int max=arr[0],sum=0;
            for(int i=0;i<n;i++){
                sum+=arr[i];
                if(sum<0)
                  sum=0;
                else if(max<sum)
                  max=sum;
            }
            System.out.println(max);
        }
    }
}
