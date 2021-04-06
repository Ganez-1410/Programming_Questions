import java.util.*;

public class Queries_with_fixed_length {
    static ArrayList<Integer> values = new ArrayList<Integer>();
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int que=sc.nextInt();
        for(int i=0;i<n;i++)
          values.add(sc.nextInt());
        for(int i=0;i<que;i++)
          System.out.println(check(sc.nextInt()));
    }
    static int check(int k){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i=0;i<values.size();i++){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for(int j=i;j<(i+k) && j<values.size();j++)
              temp.add(values.get(j));
            ans.add(Collections.max(temp));
        }
        return Collections.min(ans);
    }
}
