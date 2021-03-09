import java.util.ArrayList;
import java.util.List;

class Power3Holder {
	List < Long > pow3List;
	long currentIndex, pow3;

	public Power3Holder() {
		pow3List = new ArrayList<>();
		currentIndex = 0;
		pow3 = 1;
		pow3List.add(pow3);
	}

	public long getValue(int index) {
		if (currentIndex < index) 
			populate(index);
		return pow3List.get(index);
	}

	private void populate(int lastIndex) {
		while (currentIndex <= lastIndex) {
			pow3 *= 3;
			pow3List.add(pow3);
			currentIndex++;
		}
	}
}

public class HackerEarth {
	public static void main(String args[] ) throws Exception {
		FastReader scanner = new FastReader();
		int test = scanner.nextInt();
		Power3Holder pow3 = new Power3Holder();
		StringBuilder result = new StringBuilder();
		while (test-- > 0) {
			String s="";
			ArrayList<String> a=new ArrayList<String>();
			long offset = scanner.nextLong();
			long pow2 = 1;
			int pow2Index = 0;
			while (true) {
				long quotient = offset / pow2;
				if ((quotient & 1 )== 1) 
					a.add(String.valueOf(pow3.getValue(pow2Index)));
		        else if (quotient == 0) {
					break;
				}
				pow2 *= 2;
				pow2Index++;
			}
			result=result.append(a.size()+"\n");
			s=String.join(" ",a);
			result=result.append(test==0?s:s+"\n");
		}
		System.out.println(result);
	}
}