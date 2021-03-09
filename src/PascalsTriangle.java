import java.util.Scanner;

public class PascalsTriangle {
   static int fact(int n) {
      int k=1;
	   for(int i=2;i<=n;i++)
         k*=i;
      return k;
   }
   static int ncr(int n,int r) {
      return fact(n)/(fact(n-r)*fact(r));
   }
   public static void main(String args[]){
      int n=new  Scanner(System.in).nextInt(),i,j;
      for(i=0;i<n;i++) {
         for(j=0;j<=n-i;j++)
            System.out.print(" ");
         for(j=0;j<=i;j++)
            System.out.print(" "+ncr(i, j));
         System.out.println();
      }
   }
}