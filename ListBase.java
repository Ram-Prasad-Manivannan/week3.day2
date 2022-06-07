package week3.day2.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListBase 
{

	public List<Integer> arrToList(int[] arr) 
	{
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) 
		{
			list.add(arr[i]);
		}
		Collections.sort(list);
		return list;
	}

	public Set<Integer> arrToSet(int[] arr) 
	{
		Set<Integer> set = new TreeSet<Integer>();
		for (int i = 0; i < arr.length; i++) 
		{
			set.add(arr[i]);
		}
		return set;
	}

}