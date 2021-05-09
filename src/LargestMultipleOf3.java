import java.util.*;

public class LargestMultipleOf3{
	
	static void removeAndPrintResult(int arr[], int n,int ind1, int ind2){
		for (int i = n - 1; i >= 0; i--){
			if (i != ind1 && i != ind2)
				System.out.print(arr[i]);
		}
	}

	static void largest3Multiple(int arr[],int n,int remainder){

		if (remainder == 1){
			int[] rem_2 = new int[2];
			rem_2[0] = -1;
			rem_2[1] = -1;

			for (int i = 0; i < n; i++)	{
				if (arr[i] % 3 == 1){
					removeAndPrintResult(arr, n, i, -1);
					return;
				}

				if (arr[i] % 3 == 2){
					
					if (rem_2[0] == -1)
						rem_2[0] = i;
					
					else if (rem_2[1] == -1)
						rem_2[1] = i;
				}
			}

			if (rem_2[0] != -1 && rem_2[1] != -1){
				removeAndPrintResult(arr, n, rem_2[0],rem_2[1]);
				return;
			}
		}
		
		else if (remainder == 2){
			int[] rem_1 = new int[2];
			rem_1[0] = -1;
			rem_1[1] = -1;

			for (int i = 0; i < n; i++){
				
				if (arr[i] % 3 == 2){
					removeAndPrintResult(arr, n, i, -1);
					return;
				}

				if (arr[i] % 3 == 1){
					if (rem_1[0] == -1)
						rem_1[0] = i;
					
					else if (rem_1[1] == -1)
						rem_1[1] = i;
				}
			}

			if (rem_1[0] != -1 && rem_1[1] != -1){
				removeAndPrintResult(arr, n, rem_1[0],rem_1[1]);
				return;
			}
		}
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),sum=0;
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		Arrays.sort(arr);
		if (sum % 3 == 0) {
			for(int i=arr.length-1;i>=0;i--)
				System.out.print(arr[i]);
		}
		else
			largest3Multiple(arr, n,sum%3);
	}
}
