package week3.day2.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest extends ListBase 
{

	public static List<Integer> list1 = new ArrayList<Integer>();

	public int findSecLarg(List<Integer> list) {
		Collections.sort(list);
		int secLarge = list.get(list.size() - 2);
		return secLarge;
	}

	public static void main(String[] args) 
	{
	
		int[] data = { 3, 2, 11, 4, 6, 7 };

		FindSecondLargest secLarg = new FindSecondLargest();
		list1 = secLarg.arrToList(data);
		System.out.println("Second Largest is :" + secLarg.findSecLarg(list1));

	}

}