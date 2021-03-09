
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class CheckStrings {
    class Trie {
        TrieNode root = new TrieNode((char)0);
        
        class TrieNode {
            char val;
            HashMap<Character, TrieNode> children;
            int count = 0;
            // boolean isEnd;
            
            TrieNode(char c) {
                val = c;
                children = new HashMap<>();
            }
            //cool, coat
            public void add(int i,String w) {
                if(i == w.length()) return;
                char c = w.charAt(i);
                TrieNode next;
                if(children.containsKey(c)) {
                    next = children.get(c);
                } else {
                    next = new TrieNode(c);
                }
                next.count++;
                children.put(c, next);
                next.add(i+1, w);
            }
            
            public int get(int i, String prefix) {
                if(i == prefix.length()) return 0;
                char c = prefix.charAt(i);
                if(!children.containsKey(c)) return 0;
                if(i == prefix.length()-1) {
                    return children.get(c).count;
                }
                return children.get(c).get(i+1, prefix);
            }
            
        }
        
        public int getcount(String prefix) {
            if(prefix == null) return 0;
            return root.get(0,prefix);
        }
        
        public void addWord(String s) {
            if(s == null) return;
            root.add(0,s);
        }
    }
    
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		int ts = scn.nextInt();
		CheckStrings gfg = new CheckStrings();
		while(ts-- > 0) {
		    int n = scn.nextInt();
		    Trie trie = gfg.new Trie();
		    HashMap<String,Integer> words = new HashMap<>();
		    for(int i = 0; i < n; i++) {
		        int c = 0;
		        String w = scn.next();
		        trie.addWord(w);
		    }
		    HashMap<String,Integer> res = new HashMap<>();
		    int q = scn.nextInt();
		    for(int i = 0; i < q; i++) {
		        String qry = scn.next();
		        if(!res.containsKey(qry)) {
		            res.put(qry, trie.getcount(qry));
		        }    
		        System.out.println(res.get(qry));
		        
		    }
		}
	}
}