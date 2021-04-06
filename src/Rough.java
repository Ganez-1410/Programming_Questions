import java.util.*;

public class Rough {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		TreeSet<Character> ar=new TreeSet<>();
		for(int i=0;i<s.length();i++)
			ar.add(s.charAt(i));
		List<Character> a=new ArrayList<>();
		a.addAll(ar);
		int maxi = 0;
		for (int i = 0; i < a.size()-1; i++) {
			for (int j = i + 1; j < a.size(); j++) {
				char x = a.get(i);
				char y = a.get(j);
				String t = "";
				for (int k = 0; k < n; k++) {
					if (s.charAt(k) == x || s.charAt(k) == y) {
						t += s.charAt(k);
					}
				}
				System.out.println(t);
				boolean flag = true;
				for (int f = 0; f < t.length() - 1; f++) {
					if (t.charAt(f) == t.charAt(f + 1)) {
						flag = false;
						break;
					}
				}
				int ts = t.length();
				if ((flag) && (ts > 1))
					maxi = Math.max(maxi, ts);

			}
		}
		System.out.println(maxi);
		sc.close();
	}
} 