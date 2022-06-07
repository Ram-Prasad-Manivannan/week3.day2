package week3.day2.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber extends ListBase 
{
	
	public static int[] numbers = { 4, 6, 7, 2, 3, 1, 9, 10, 8, 8, 6, 2 };
	public static Set<Integer> set=new TreeSet<Integer>();
	
	public void findMissing(Set<Integer> set) 
	{
		List<Integer> list = new ArrayList<Integer>();
		list.addAll(set);

		for (int i = 0; i < list.size(); i++) 
		{

			if ((list.get(i) != i + 1)) 
			{
				System.out.println("Missing number is :" + (list.get(i) - 1));
				break;
			}

		}
		
	}

	public static void main(String[] args) 
	{
	    
		MissingNumber misNum=new MissingNumber();
		set = misNum.arrToSet(numbers);
		misNum.findMissing(set);

	}

}