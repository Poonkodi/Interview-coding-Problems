package String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/*
 * Given an input string, reverse the string word by word.

For example,
Given s = "the sky is blue",
return "blue is sky the".
 */
public class ReverseWordsInString {

	public void reverseWords(String s) {
		StringTokenizer st=new StringTokenizer(s);
		String arr[]=new String();

//		List<String> l=new ArrayList<String>();
//		int cnt=0;
//		while(st.hasMoreTokens())
//		{
//			l.add(st.nextToken());
//			System.out.println(st.nextToken());
//			cnt++;
//		}
//		Collections.reverse(l);
		
		

	}

	public static void main(String args[])
	{
		ReverseWordsInString r=new ReverseWordsInString();
		r.reverseWords("the sky is blue");
	}

}
