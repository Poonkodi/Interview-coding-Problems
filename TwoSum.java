import java.util.Arrays;

/*
 * Given an array of integers, find two numbers such that they add up to a specific target number.
The function twoSum should return indices of the two numbers such that they add up to the target, 

You may assume that each input would have exactly one solution.
Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2
 */

public class TwoSum {
	public static int[] twoSum(int[] nums, int target) 
	{
		int[] array1 = new int[2];
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				System.out.println(i+" i and j value "+(j));
				System.out.println(nums[i]+" "+nums[j]);

				if((nums[i]+nums[j]) ==target)
				{
					array1[0]=i;
					array1[1]=j;
				}
			}
		}
		return array1;
	}
	public static void main(String args[])
	{
		int arr[]={2,7,11,15};
		//System.out.println(Arrays.toString(twoSum(arr,9)));
		System.out.println(Arrays.toString(twoSum(arr,17)));

	}
}
