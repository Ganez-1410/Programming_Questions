import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            int[] a=new int[n];
            int[] b=new int[m];
            for(int i=0;i<n;i++)
              a[i]=sc.nextInt();
            for(int i=0;i<m;i++)
              b[i]=sc.nextInt();
            Stack<Integer> s=new Stack<Integer>();
            Stack<Integer> s1=new Stack<Integer>();
            for(int i=n-1;i>=0;i--)
              s.push(a[i]);
            for(int i=m-1;i>=0;i--)
              s1.push(b[i]);
              int sum=0,c=0;
            while(sum<=k){
                int p,p1;
                if(s.isEmpty())
                 p=Integer.MAX_VALUE;
                else
                 p=s.peek();
                if(s1.isEmpty())
                 p1=Integer.MAX_VALUE;
                else
                 p1=s1.peek();
                if(p<p1){
                  sum+=p;
                  s.pop();
                }
                else{
                 sum+=p1;
                 s1.pop();
                }
                c++;
            }
            System.out.println(--c);
        }
    }
}
