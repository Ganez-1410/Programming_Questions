import java.util.*;

public class PaintingFence {
    static long check(int n,int k){
        long total=k;
        int same=0,diff=k;
        for(int i=2;i<=n;i++){
            same=diff;
            diff=(int)(total*(k-1));
            diff=diff%1000000007;
            total=(same+diff)%1000000007;
        }
        return total;
    }
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        System.out.println(check(n,k));
    }
}
