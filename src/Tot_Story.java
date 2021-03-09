
public class Tot_Story {
public static void main(String[] args) {
	int n=5;
	int[] s= {56,8,32,32,35};
	int[] t= {43,27,27,27,24};
	int[] in= {1,2,3,4,5};
	for(int i=0;i<n-1;i++) {
		for(int j=i+1;j<n;j++) {
			if(t[i]>t[j]) {
				int temp=t[i];
				t[i]=t[j];
				t[j]=temp;
				temp=s[i];
				s[i]=s[j];
				s[j]=temp;
			}
		}
	}
//		for(int i=0;i<n;i++)
//			System.out.println(t[i]+" "+s[i]);
	for(int i=0;i<n-1;i++) {
		for(int j=i+1;j<n;j++) {
			if(t[i]==t[j]) {
				if(s[i]>s[j])
					System.out.print(s[i]);
				else if(s[i]<s[j])
					System.out.print(s[j]);
				else {
					System.out.println(in[i]<in[j]?in[j]:in[i]);
				}
				break;
			}
		}
		System.out.println();
	}
}
}
