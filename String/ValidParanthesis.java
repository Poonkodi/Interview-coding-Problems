package String;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
/*
 * check if a string is of a few valid parentheses.
 *  e.g., "()([]{()})" is valid, while "()))" not.  
 */
public class ValidParanthesis {
	Stack<Character> tokstack;
	Map<Character,Character> hset;
	ValidParanthesis()
	{
		hset=new HashMap<Character,Character>();
		hset.put('}','{');
		hset.put(']','[');
		hset.put(')','(');
		tokstack=new Stack<Character>();		
	}
	private  boolean evaluate(String str) {
		char array1[]=str.toCharArray();
		for(int i=0;i<array1.length;i++)
		{
			if(!hset.containsKey(array1[i]))
			{
//				System.out.println("-In if--"+array1[i]);
				tokstack.push(array1[i]);
			}
			else 
			{
				if(tokstack.isEmpty()||tokstack.pop()!=hset.get(array1[i]))
				{
//					System.out.println("-In else--"+array1[i]);
//					System.out.println("-In else--"+hset.get(array1[i]));
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String args[])
	{
		String str="()([]{()})";
		String str1="()))";
		String str2="((({{}})))";
		ValidParanthesis v=new ValidParanthesis();
		System.out.println(v.evaluate(str));
		System.out.println(v.evaluate(str1));
		System.out.println(v.evaluate(str2));

	}


}
