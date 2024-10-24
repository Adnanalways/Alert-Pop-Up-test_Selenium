package alerttest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class alerttest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver-win64 (130)\\chromedriver-win64\\chromedriver.exe");
		

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://codenboxautomationlab.com/practice/");
		
	driver.findElement(By.id("name")).sendKeys("joy");
	driver.findElement(By.id("alertbtn")).click();
	
	//switch driver from html to alert box
	String alertText=driver.switchTo().alert().getText();
	System.out.println(alertText);
	Thread.sleep(3000l);
	driver.switchTo().alert().accept();
	driver.quit();
	
	
			

	}

}
