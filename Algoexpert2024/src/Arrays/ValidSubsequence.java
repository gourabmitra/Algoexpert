package Arrays;

import java.util.*;
public class ValidSubsequence {
	
	public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence)
	{
		int sequenceIndex = 0;
		int arrayIndex = 0;
		while(sequenceIndex < sequence.size() && arrayIndex<array.size())
		{
			if(array.get(arrayIndex)==sequence.get(sequenceIndex))
			{
				arrayIndex++;
				sequenceIndex++;
			}
			else
			{
				arrayIndex++;
			}
		}
		if(arrayIndex == array.size())
			return true;
		else
			return false;
					
	}
	
	public static void main(String[] args)
	{
		List<Integer> array=Arrays.asList(5,1,22,25,6,-1,8,10);
		List<Integer> sequence=Arrays.asList(1,6,-1,10);
		boolean result = isValidSubsequence(array,sequence);
		System.out.print(result);
		
	}

}
