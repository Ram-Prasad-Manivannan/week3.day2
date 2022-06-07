package week3.day2.assignment;

public class Automation extends MultipleLanguage 
{

	public static void main(String[] args) 
	{

		Automation auto=new Automation();
		auto.java();
		auto.selenium();
		auto.python();
		auto.ruby();

	}

	public void java() 
	{
     	System.out.println("---Java---");
	}

	public void selenium() 
	{
		System.out.println("---Selenium---");
	}

	@Override
	public void ruby() 
	{
			System.out.println("---Ruby---");
	}

}