import java.util.ArrayList; 
import java.util.Deque; 
import java.util.LinkedList; 
  
public class AllPossible_Palindrome_in_a_string
{ 
    public static void main(String[] args)  
    { 
        String input = "abcbcabbacba"; 
        allPalPartitions(input); 
    } 
    private static void allPalPartitions(String input)  
    { 
        int n = input.length(); 
        ArrayList<ArrayList<String>> allPart = new ArrayList<>(); 
        Deque<String> currPart = new LinkedList<String>(); 
        allPalPartitonsUtil(allPart, currPart, 0, n, input);  
        String s="";
        for (int i = 0; i < allPart.size(); i++)  
        { 
            for (int j = 0; j < allPart.get(i).size(); j++) 
            { 
                if(s.length()<allPart.get(i).get(j).length())
                	s=allPart.get(i).get(j);
            } 
        } 
  System.out.println(s);
    } 
    private static void allPalPartitonsUtil(ArrayList<ArrayList<String>> allPart,  
            Deque<String> currPart, int start, int n, String input) 
    {  
        if (start >= n)  
        { 
            allPart.add(new ArrayList<>(currPart)); 
            return; 
        } 
        for (int i = start; i < n; i++)  
        { 
            if (isPalindrome(input, start, i)) 
            { 
                currPart.addLast(input.substring(start, i + 1)); 
                allPalPartitonsUtil(allPart, currPart, i + 1, n, input); 
                currPart.removeLast(); 
            } 
        } 
    } 
    private static boolean isPalindrome(String input,int start, int i) 
    { 
        while (start < i)  
        { 
            if (input.charAt(start++) != input.charAt(i--)) 
                return false; 
        } 
        return true; 
    } 
} 