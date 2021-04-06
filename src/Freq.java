import java.util.*;

public class Freq{
    public static Map<String,Integer> h=new HashMap<String,Integer>();
    public static void main(String[] arg){
        String s=new Scanner(System.in).nextLine();
        String[] ch=s.split(" ");
        for(int i=0;i<ch.length;i++){
            if(h.containsKey(ch[i]))
              h.put(ch[i],h.get(ch[i])+1);
            else
              h.put(ch[i],1);
        }
        ArrayList<String> a=new ArrayList<String>(h.keySet());
        a.sort(new Comparator<String>(){
            public int compare(String a,String b){
                int i=h.get(a);
                int j=h.get(b);
                if(i==j)
                  return a.compareTo(b);
                return j-i;
            }
        });
        for(int i=0;i<a.size();i++){
            int n=h.get(a.get(i));
            for(int j=0;j<n;j++)
             System.out.print(a.get(i)+" ");
        }
    }
}