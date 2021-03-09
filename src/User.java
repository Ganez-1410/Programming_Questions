public class User{
	static int digits(int input1,int input2,int input3) 
	{ 
	    int largest = 0; 
	    int smallest = 9; 
	    int arr[]= {input1,input2,input3};
	    int m=0,n=0;
	   for(int i=0;i<3;i++) {
		   largest = 0;
		   smallest = 9;
		   while(arr[i] != 0)  
	    { 
	        int r = arr[i] % 10;  
	        largest = Math.max(r, largest); 
	        smallest = Math.min(r, smallest);
	        arr[i] = arr[i] / 10; 
	    } 
		   m+=largest;
		   n+=smallest;
	   }
	   return m-n;
	} 
	public static void main(String[] args) {
		System.out.println(digits(3521,2452,1352));
	}
}