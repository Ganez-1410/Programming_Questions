import java.util.*;

public class BitDiff {
	static List check(int[] arr) {
		ArrayList<Integer> a=new ArrayList<>();
		ArrayList<Integer> fin=new ArrayList<>();
		for(int i:arr) {
			if(a.contains(i))
				fin.add(i);
			else
				a.add(i);
		}
		System.out.println(fin);
		Collections.sort(fin);
		System.out.println(fin);
		for(int i=0;i<fin.size();i++) {
			int k=Math.abs(Integer.toBinaryString(fin.get(i)).length()-Integer.bitCount(fin.get(i)));
			fin.set(i,k);
		}
		return fin;
	}
public static void main(String[] args) {
	System.out.println(check(new int[] {4,3,2,7,8,3,2,1}));
}
}
