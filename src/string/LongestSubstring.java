package string;
import java.io.*;
import java.util.*;

class LongestSubstring {
	public static Boolean dif(String str , int i , int j){
		boolean[] vis=new boolean[26];
	for (int k=i;k<=j;k++){
		if(vis[str.charAt(k)-'a']==true)
			return false;
		vis[str.charAt(k)-'a']=true;
	}
	return true;
}

public static int longest(String str){
	int n=str.length();
	int res=0;
	for(int i=0;i<n;i++)
		for(int j=i;j<n;j++)
			if(dif(str,i,j))
				res=Math.max(res,j-i+1);
			return res;
}

	public static void main(String[] args) {
		String str="helloworldgeeksforgeeks";
System.out.println("input is" + str);
int len=longest(str);
System.out.println(len);
}
}