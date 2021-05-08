import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/request-demo/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='title']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("Miller");
		driver.findElement(By.xpath("//input[@type='text' and @name='firstname']")).sendKeys("Ron");
		driver.findElement(By.xpath("//input[@type='text' and @name='phone_work']")).sendKeys("1234");
		Thread.sleep(5000);
		WebElement RequestDemo = driver.findElement(By.cssSelector("#field1 > div > input"));
		Actions scroll = new Actions(driver);
		scroll.moveToElement(RequestDemo);
		scroll.perform();
		Thread.sleep(2000);
		WebElement Salesbutton = driver.findElement(By.id("interest_sell_c0"));
		Salesbutton.click();
		Thread.sleep(2000);
		WebElement Radio1=driver.findElement(By.id("doi0"));
		Radio1.click();
		Thread.sleep(2000);
		System.out.println(Radio1.isSelected());
		WebElement CompanySize=driver.findElement(By.xpath("//select[@name='employees_c']"));
		Select select=new Select(CompanySize);
		select.selectByIndex(3);
		Thread.sleep(2000);
		select.selectByValue("level8");
		Thread.sleep(2000);
		select.selectByVisibleText("251 - 500 employees");
		
		
		
		
		
		

	}

}
