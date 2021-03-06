import java.util.*;

public class FreqArray {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] array=new int[n+m];
        for(int i=0;i<(n+m);i++)
          array[i]=sc.nextInt();
        sc.close();
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> outputArray=new ArrayList<>();

        for(int current:array){
            int count=map.getOrDefault(current,0);
            map.put(current,count+1);
            outputArray.add(current);
        }
        SortComparator comp=new SortComparator(map);

        Collections.sort(outputArray,comp);

        for(Integer i:outputArray)
         System.out.print(i+" ");
    }
}
 class SortComparator implements Comparator<Integer>{
     private final Map<Integer,Integer> freqMap;
     SortComparator(Map<Integer,Integer> tFreqMap){
         this.freqMap=tFreqMap;
     }
     public int compare(Integer k1,Integer k2){
         int freqCompare = freqMap.get(k2).compareTo(freqMap.get(k1));
         int valueCompare=k1.compareTo(k2);
         if(freqCompare==0)
           return valueCompare;
        return freqCompare;
     } 
 }