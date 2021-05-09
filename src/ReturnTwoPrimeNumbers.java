import java.util.*;

public class ReturnTwoPrimeNumbers {
    static boolean isPrime(int n){
        if(n%2==0)
        return false;
        for(int i=3;i*i<=n;i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }    
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            for(int i=2;i<=n/2;i++){
                if(isPrime(i) && isPrime(n-i)){
                    System.out.println(i+" "+(n-i));
                    break;
                }
            }
        }
    }
}
