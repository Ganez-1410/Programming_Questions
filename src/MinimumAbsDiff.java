import java.util.*;

public class MinimumAbsDiff {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> ar=new ArrayList<>();
        for(int i=0;i<n;i++)
           ar.add(sc.nextInt());
        int min=Integer.MAX_VALUE,t;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                t=Math.abs(ar.get(i)-ar.get(j));
                if(t<min)
                  min=t;
            }
        }
        System.out.println(min);
    }
}
