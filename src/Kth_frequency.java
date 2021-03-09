import java.util.*;
public class Kth_frequency {
    public static void main(String args[] ) throws Exception {
     Scanner sc = new Scanner(System.in);
     int n=sc.nextInt();
     int[] a=new int[n];
     for(int i=0;i<n;i++)
     a[i]=sc.nextInt();
     int K=sc.nextInt();
     int k=0,l=0,count=1,temp=0,temp1=0;
     int[] b=new int[n];
     int[] c=new int[n];
     for(int i=0;i<n;i++){
        count=1;
         if(a[i]!=0){
             for(int j=i+1;j<n;j++){
                 if(a[i]==a[j]){
                     count++;
                     a[j]=0;
                 }
             }
             b[k++]=a[i];
             c[l++]=count;
         }
     }
     for(int i=0;i<k;i++){
        for(int j=i+1;j<k;j++){
             if(c[i]<c[j]){
                 temp=c[i];
                 c[i]=c[j];
                 c[j]=temp;
                 temp1=b[i];
                 b[i]=b[j];
                 b[j]=temp1;
             }
         }
     }
   for(int i=0;i<K;i++)
   System.out.print(b[i]+" ");
    }
}