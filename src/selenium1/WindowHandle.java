package selenium1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chromedriver", "C:\\selenium webdriver\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.leafground.com/window.xhtml");
		 driver.manage().window().maximize();
		String oldwindow= driver.getWindowHandle();
		WebElement firstbutton= driver.findElement(By.id("j_idt88:new"));	
		
		firstbutton.click();
		
		Set <String>handles=driver.getWindowHandles();
		
		for(String newWindow:handles)
		{
		
			
			driver.switchTo().window(newWindow);
		}
	}

}
