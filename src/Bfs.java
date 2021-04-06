import java.util.*;
public class Bfs {
   static int n=6,front=-1,rear=-1;
   static int[][] adj=new int[n+1][n+1];
   static int[] visit=new int[n+1];
   static int[] queue=new int[n+1];
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
   int ch;
do
	{
		int v1=sc.nextInt();
      int v2=sc.nextInt();
      adj[v1][v2]=1;
      ch=sc.nextInt();
	}while(ch==1);
	for(int i=1;i<=n;i++)
	{
		if(visit[i]==0)
		bfs(i);
	}
}
static void bfs(int v)
{
  System.out.println(v);
   visit[v]=1;
  enqueue(v);
  int i,k;
  while(front!=-1)
  {
  	k=dequeue();
  	for(i=1;i<=n;i++)
  	{
  		if(adj[k][i]==1)
  		{
  			if(visit[i]==0)
  			{
            System.out.println(v);
  				visit[i]=1;
  				enqueue(i);
			  }
		  }
	  }
  }
}
static void enqueue(int ele)
{
	if(front==-1)
	front++;
	queue[++rear]=ele;
}
static int dequeue()
{
	int ele=queue[front];
	if(front==rear)
	front=rear=-1;
	else
	front++;
	return ele;
}

   }
