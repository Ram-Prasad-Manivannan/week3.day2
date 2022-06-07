package week3.day2.assignment;

import java.util.ArrayList;
import java.util.List;

public class PrintDuplicates extends ListBase 
{

	public static int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
	public static List<Integer> list1 = new ArrayList<Integer>();

	public void findDuplicates(List<Integer> list) 
	{

		for (int i = 0; i < list.size() - 1; i++) 
		{
			for (int j = i + 1; j < list.size(); j++) 
			{
				if (list.get(i) == list.get(j))
					System.out.println(list.get(i));
			}
		}

	}

	public static void main(String[] args) 
	{
	
		PrintDuplicates dups = new PrintDuplicates();
		list1 = dups.arrToList(arr);
		System.out.println("Duplicates are: ");
		dups.findDuplicates(list1);

	}

}