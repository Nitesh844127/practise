package array;


import java.util.*;
//import java.io.*;

class LetterCount {

		static String SearchingChallenge(String str) {
			// code goes here
			int count=0,temp;
			String[] wordList=str.split(" ") ;
			String word =wordList[0];

			for(int i=0;i<wordList.length;i++){
				for(int j=0;j<wordList[i].length();j++){
					temp=0;
					for(int k=0;k<wordList[i].length();k++){
						if(wordList[i].charAt(j)==wordList[i].charAt(k)){
							temp++;
						}
					}
					if(count < temp){
						count=temp;
						word=wordList[i];
						//temp=0;
					}
				}
			}
			if(count==1){
				return "-1";
			}

			str=word;

			return str;

		}

		public static void main (String[] args) {
			// keep this function call here

			Scanner s = new Scanner(System.in);
		LetterCount x=new LetterCount();
			System.out.print(x.SearchingChallenge(s.nextLine()));
		}

	}

