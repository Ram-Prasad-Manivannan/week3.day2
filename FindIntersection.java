package week3.day2.assignment;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection{

	public static int[] arr1 = { 3, 2, 11, 4, 6, 7 };
	public static int[] arr2 = { 1, 2, 8, 4, 9, 7 };

	public static List<Integer> list1 = new ArrayList<Integer>();
	public static List<Integer> list2 = new ArrayList<Integer>();

	public List<Integer> arrToList(int[] arr) 
	{
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) 
		{
			list.add(arr[i]);
		}
		return list;
	}

	public void findIntersection(List<Integer> list1, List<Integer> list2) 
	{

		for (int i = 0; i < list1.size(); i++) 
		{
			for (int j = 0; j < list2.size(); j++) 
			{
				if (list1.get(i) == list2.get(j)) 
				{
					System.out.println(list1.get(i));
				}
			}

		}

	}

	public static void main(String[] args) 
	{


		FindIntersection inter = new FindIntersection();
		list1 = inter.arrToList(arr1);
		list2 = inter.arrToList(arr2);
		inter.findIntersection(list1, list2);

	}

}