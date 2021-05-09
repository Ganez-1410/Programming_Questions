import java.util.*;
/*
  Given N= 9 and A= [1,2,2,1,2,1,1,1,1]

For type 1, Ramu can choose at most four dishes. One of the ways to choose four dishes of type 1 is A1,A4, A7 and A9.

For type 2, Ramu can choose at most two dishes. One way is to choose A3 and A5.

So in this case, Ramu should go for type 1, in which he can pick more dishes.
*/
public class Dishes {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int c1=0,i1=-1,c2=0,i2=-1;
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                int k=sc.nextInt();
                if(k==1){
                    if(i1==-1){
                        c1++;
                        i1=i;
                    }
                    else if(!(Math.abs(i1-i)==1)){
                        c1++;
                        i1=i;
                    }
                }
                else{
                    if(i2==-1){
                        c2++;
                        i2=i;
                    }
                    else if(!(Math.abs(i2-i)==1)){
                        c2++;
                        i2=i;
                    }
                }
            }
              //System.out.println(c1+" "+c2);
              if(c1!=c2)
                System.out.println(c1<c2?2:1);
              else
                System.out.println(1);
        }
    }
}
