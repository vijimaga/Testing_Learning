package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SuiteExample {

	// aim :open to google chrome
	// 1.google open 2.bing.com 3.yahoo .com open the door and close//
	@Test
	public void openGoogle() {
		long startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chromedriver", "C:\\selenium webdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.quit();
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total time taken " + totalTime);

	}

	@Test
	public void openBing() {
		long startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chromedriver", "C:\\selenium webdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.quit();
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total time taken " + totalTime);

	}

	@Test
	public void openYahoo() {
		long startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chromedriver", "C:\\selenium webdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yahoo.com/");
		driver.quit();
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total time taken " + totalTime);

	}
}
