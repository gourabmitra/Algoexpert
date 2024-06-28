package Arrays;
import java.util.*;

public class TwoNumberSum {
	
public static int[] TwoSum(int[] array, int targetSum)
	{
		
	Set<Integer> set = new HashSet<Integer>() ;
	 for(int i:array)
	{
		if(set.contains(targetSum-i) && targetSum !=i)
		{
			return new int[] {i,targetSum-i};
		}
		
		else if(!set.contains(i))
		{
			set.add(i);
		}
	}

	return new int[] {0,0};
	}

public static void main(String[] args)
{
	int array[] = {3, 5, -4, 8, 11, 1, -1, 6};
	int targetSum =10;
	int result[] = TwoSum(array,targetSum);
	System.out.print(result[0]+","+result[1]);
	
}
}