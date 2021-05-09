import java.util.Scanner;
/*ip: op:
 * 2  4
 * 6  7
 * 9
 * 
 * In the first test case, 6 has a leading digit 1 in bases 2, 4, 5 and 6: 610 = 1102 = 124 = 115 = 106.
 * */
public class Log {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
        int n=sc.nextInt(),c=0;
        for(int i=2;i<=n;i++){
            if(Integer.toString(n,i).charAt(0)=='1')
              c++;
        }
        System.out.println(c);
    }
}
}
