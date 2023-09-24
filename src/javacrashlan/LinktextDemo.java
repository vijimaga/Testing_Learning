package javacrashlan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinktextDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chromedriver","C:\\selenium webdriver\\chromedriver-win64\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.leafground.com/input.xhtml");
		 driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]"));
		
	}

}
