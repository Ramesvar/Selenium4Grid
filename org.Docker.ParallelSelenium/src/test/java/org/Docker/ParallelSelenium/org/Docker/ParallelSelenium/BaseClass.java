package org.Docker.ParallelSelenium.org.Docker.ParallelSelenium;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.service.DriverService;
import org.testng.annotations.Test;

public class BaseClass {
	
	/*public static void main(String args[]) {
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Ramesh\\Selenium\\ChromeDriver\\106.0.5249.61\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println(SeleniumManager.getInstance().getDriverPath("chromedriver"));
		
	}*/
	
	@Test
	public void initDriver() throws InterruptedException, IOException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		//WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.10:4449"), capabilities);
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.10:4444"), capabilities);
		System.out.println(SeleniumManager.getInstance().getDriverPath("chromedriver"));
		driver.navigate().to("https://www.facebook.com");
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(".\\screenshot.jpg"));

		Thread.sleep(5000);
	}

}
