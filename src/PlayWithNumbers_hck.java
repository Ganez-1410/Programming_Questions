import java.util.*;
	import java.io.*;
public class PlayWithNumbers_hck {
	    
	static class FastReader {


	 

	BufferedReader br;

	StringTokenizer st;


	 

	public FastReader() {

	br = new BufferedReader(new

	InputStreamReader(System.in));

	}


	 

	String next() {

	while (st == null || ! st.hasMoreElements()) {

	try {

	st = new StringTokenizer(br.readLine());

	} catch (IOException e) {

	e.printStackTrace();

	}

	}

	return st.nextToken();

	}


	 

	int nextInt() {

	return Integer.parseInt(next());

	}


	 

	long nextLong() {

	return Long.parseLong(next());

	}


	 

	double nextDouble() {

	return Double.parseDouble(next());

	}


	 

	String nextLine() {

	String str = "";

	try {

	str = br.readLine();

	} catch (IOException e) {

	e.printStackTrace();

	}

	return str;

	}


	 

	public void close() {

	try {

	br.close();

	} catch (IOException e) {

	e.printStackTrace();

	}

	}

	}
	    public static void main(String args[] ) throws Exception {
	        //Scanner sc = new Scanner(System.in);
	        FastReader fr = new FastReader();
	        int n=fr.nextInt();
	        int m=fr.nextInt(),sum;
	        int[] a=new int[n+1];
	        for(int i=1;i<=n;i++){
	            a[i]=fr.nextInt()+a[i-1];
	        }
	        String s="";
	        while(m-->0){
	            int x=fr.nextInt();
	            int y=fr.nextInt();
	            //System.out.println(sum/(y-x+1));
	            sum=(int)Math.floor((a[y]-a[x-1])/(y-x+1));
	            s+=""+sum+"\n";
	        }
	        System.out.println(s);
	    }
	}

