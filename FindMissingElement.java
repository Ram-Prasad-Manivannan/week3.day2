package week3.day2.assignment;

import java.util.ArrayList;
import java.util.List;

public class FindMissingElement extends ListBase
{

	public static int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
	public static List<Integer> list1 = new ArrayList<Integer>();

	public void findMissing(List<Integer> list) 
	{
		for (int i = 0; i < list.size(); i++) 
		{
			if (list.get(i) != i + 1) 
			{
				System.out.println(i + 1);
				break;
			}
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FindMissingElement missEle = new FindMissingElement();
		list1 = missEle.arrToList(arr);
		System.out.println("Missing element is ");
		missEle.findMissing(list1);

	}

}