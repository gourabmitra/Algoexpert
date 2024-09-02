package Arrays;

import java.util.Arrays;

public class SortedSquaredArray {
	
	public static int[] sortedSquaredArray(int[] array)
	{
		
		for(int i=0;i<array.length;i++)
		{
			array[i] = array[i] * array[i];
		}
		Arrays.sort(array);
		
		return array;
			
		
		}
	
	public static void main(String[] args)
	{
		int array[] = {1,2,3,5,6,8,9};
		int result[] = sortedSquaredArray(array);
		for(int i=0;i<result.length;i++)
		{
		System.out.print(result[i]);
		System.out.println();
		}
	}
	
	
	
	
	

}
