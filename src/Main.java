import java.util.*;
public class Main
{
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  int size=sc.nextInt();
  if(size>100)
  {
	  System.out.println("greater 100");
  }
  else
  {
  int[] arr=new int[size];
  String[] str=new String[size];
  boolean check=true;
  for(int i=0;i<size;i++)
  {
    arr[i]=sc.nextInt();
    if(arr[i]>100)
    {
    	check=false;
    	break;
    }
  }
  if(check==false)
  {
	  System.out.println("greater 100");
  }
  else
  {
  int count=0;
  for(int i=0;i<size;i++)
  {
	  str[i]=find(arr[i]);
	  char[] c=str[i].toCharArray();
	  for(int j=0;j<c.length;j++)
	  {
		  if(c[j]=='a' || c[j]=='e' || c[j]=='i' || c[j]=='o' || c[j]=='u')
			  count++;
	  } 
  }
  int count1=0;
  int sum=0;
  for(int i=0;i<size;i++)
  {
	  for(int j=i+1;j<size;j++)
	  {
		  sum=arr[i]+arr[j];
		  if(sum==count)
			  count1++;
	  }
  }
  System.out.print(find(count1));
  }
  }
  
}
static String find(int n)
{
	String s=Integer.toString(n);
	String ans="";
	if(n==10)
		ans="hundred";
	else if(n>=0 && n<=9)
	{
		ans="";
		switch(n)
		{
		case 0:ans="zero";break;
		case 1:ans="one";break;
		case 2:ans="two";break;
		case 3:ans="three";break;
		case 4:ans="four";break;
		case 5:ans="five";break;
		case 6:ans="six";break;
		case 7:ans="seven";break;
		case 8:ans="eight";break;
		case 9:ans="nine";break;
		}
	}
	else if(s.length()==2)
	{
		if(n>=10 && n<=19)
		{
			ans="";
			switch(n)
			{
			case 10:ans="ten";break;
			case 11:ans="eleven";break;
			case 12:ans="twelve";break;
			case 13:ans="thirteen";break;
			case 14:ans="fourteen";break;
			case 15:ans="fifteen";break;
			case 16:ans="sixteen";break;
			case 17:ans="seventeen";break;
			case 18:ans="eighteen";break;
			case 19:ans="nineteen";break;
			}
		}
		else
		{
			ans="";
		int last=n%10;
		n=n/10;
		int first=n%10;
		switch(first)
		{
		case 2:ans=ans+"twenty";break;
		case 3:ans=ans+"thrity";break;
		case 4:ans=ans+"forty";break;
		case 5:ans=ans+"fifty";break;
		case 6:ans=ans+"sixty";break;
		case 7:ans=ans+"seventy";break;
		case 8:ans=ans+"eighty";break;
		case 9:ans=ans+"ninety";break;
		}
		switch(last)
		{
		case 1:ans=ans+"one";break;
		case 2:ans=ans+"two";break;
		case 3:ans=ans+"three";break;
		case 4:ans=ans+"four";break;
		case 5:ans=ans+"five";break;
		case 6:ans=ans+"six";break;
		case 7:ans=ans+"seven";break;
		case 8:ans=ans+"eight";break;
		case 9:ans=ans+"nine";break;
		}
		}
		
	}
	return ans;
}
}
