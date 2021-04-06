import java.util.*;

public class LargestNumber {
    static void print(Vector<String> arr){
        Collections.sort(arr,new Comparator<String>()
        {
             public int compare(String X,String Y){
                String XY=X+Y;
                String YX=Y+X;
                return XY.compareTo(YX)>0?-1:1;
            }
             
        });
        System.out.println(arr);
        Iterator<String> it=arr.iterator();
        while(it.hasNext())
          System.out.print(it.next());
    }
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        Vector<String> arr=new Vector<>();
        int n=sc.nextInt();
        while(n-->0)
          arr.add(String.valueOf(sc.nextInt()));
        print(arr);
        sc.close();
    }
	
}
