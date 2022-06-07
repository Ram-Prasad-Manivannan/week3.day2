
package week3.day2.assignment;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesSet 
{
  public static void main(String[] args) 
  {
		String name1 = "Selenium is awesome and learning is fun by testleaf";
		char[] allChars = name1.toCharArray();
		System.out.println(allChars);
		Set<Character> Unique = new LinkedHashSet<Character>();
		for (int i = 0; i < allChars.length; i++) 
		{
			if (Unique.add(allChars[i])) 
			{
				System.out.print(allChars[i]);
			}
		}

	}

}




