package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioButtom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		// 2. Initialize Webdriver object through ChromeDriver class. 
	        ChromeDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.amazon.com/ link using get method.
	        browserObject.get("http://training.qaonlinetraining.com/testPage.php");

	        browserObject.findElement(By.xpath("/html/body/form/input[4]")).click();
	        browserObject.findElement(By.xpath("/html/body/form/input[5]")).click();
	        browserObject.findElement(By.name("bike")).click();
	        
	        Select se=new Select(browserObject.findElement(By.name("country")));
	        se.selectByVisibleText("France");
	        
	        Select skill= new Select(browserObject.findElement(By.name("skill")));
	        skill.selectByVisibleText("Database");
	        skill.selectByVisibleText("Quality Assurance");
	}

}
