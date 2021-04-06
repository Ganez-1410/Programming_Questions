import java.util.*; 

public class JobSequencing 
{ 
	char id; 
	int deadline, profit; 

   JobSequencing(){}
	public JobSequencing(char id, int deadline, int profit) 
	{ 
		this.id = id; 
		this.deadline = deadline; 
		this.profit = profit; 
	} 

   void printJobScheduling(ArrayList<JobSequencing> arr, int t) 
	{ 
		int n = arr.size(); 
      
      for(int i=0;i<arr.size();i++)
			System.out.println(arr.get(i).id+" "+arr.get(i).deadline+" "+arr.get(i).profit);
		
      boolean result[] = new boolean[t]; 

		char job[] = new char[t]; 

		for (int i = 0; i < n; i++) 
		{ 
			for (int j = arr.get(i).deadline - 1; j >= 0; j--) { 
	
            if (result[j] == false) 
				{ 
					result[j] = true; 
					job[j] = arr.get(i).id; 
					break; 
				} 
			} 
		} 

		System.out.println();
		for (char jb : job) 
		{ 
			System.out.print(jb + " "); 
		} 
		System.out.println(); 
	} 

	public static void main(String args[]) 
	{ 
		ArrayList<JobSequencing> arr = new ArrayList<JobSequencing>(); 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),max=Integer.MIN_VALUE; 
		for(int i=0;i<n;i++) {
			char ch=sc.next().charAt(0);
			int d=sc.nextInt();
			int p=sc.nextInt();
			if(max<d)
				max=d;
		arr.add(new JobSequencing(ch, d,p)); 
		}
		System.out.println("Following is maximum "+"profit sequence of jobs"); 

		JobSequencing job = new JobSequencing(); 
		Collections.sort(arr,(a, b) -> b.profit - a.profit);

      job.printJobScheduling(arr,max); 
	} 
} 

