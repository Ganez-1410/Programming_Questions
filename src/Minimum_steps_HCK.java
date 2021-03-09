import java.util.Scanner;

public class Minimum_steps_HCK {

public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
        int k=sc.nextInt(), m=sc.nextInt(), n=sc.nextInt();
        int count=0,x;
        while(k<m)
          {
              if(m%n==0)
             {
                 m=m/n;
                 count++;
             }
             else{
            	 x=(n-(m%n));
                 m+=(n-(m%n))/2*2+(n-(m%n))%2;
                 count+=x/2+x%2;
               }  
          }
          if(k>m)
            count+=(k-m)/2+(k-m)%2;
         System.out.println(count);
        }
    }
}

