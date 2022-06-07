package week3.day2.assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
	
		driver.get("https://www.ajio.com/");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.name("searchVal")).sendKeys("bags"+ "\n");
		
		driver.findElement(By.xpath("//input[@id='Men']/following-sibling::label")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='Men - Fashion Bags']/following-sibling::label")).click();
		
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//div[@class='length']")).getText());
		
		List<WebElement> eleBrands = driver.findElements(By.xpath("//div[@class='brand']"));
		
		System.out.println("Brand of the products displayed in the page are---- ");
		for(WebElement e:eleBrands)
			System.out.println(e.getText());
		
		List<WebElement> eleBagNames = driver.findElements(By.xpath("//div[@class='nameCls']"));
		System.out.println("Names of the bags in the page are-----");
		for(WebElement e:eleBagNames)
			System.out.println(e.getText());
		
		driver.close();
	}
	

}

