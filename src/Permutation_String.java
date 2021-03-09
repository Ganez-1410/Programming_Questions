
public class Permutation_String {
	public static void main(String[] args) {
		permut("","abc");
	}
	static void permut(String perm,String in) {
		if(in.length()==0) {
			System.out.println(perm);
		}
		else {
			for(int i=0;i<in.length();i++)
				permut(perm+in.charAt(i),in.substring(0,i)+in.substring(i+1));
		}
	}
}
