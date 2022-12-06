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
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.service.DriverService;
import org.testng.annotations.Test;

public class BaseClass2 {
	
	/*public static void main(String args[]) {
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Ramesh\\Selenium\\ChromeDriver\\106.0.5249.61\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println(SeleniumManager.getInstance().getDriverPath("chromedriver"));
		
	}*/
	
	@Test
	public void initDriver() throws IOException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		//WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.10:4449"), capabilities);
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.10:4444"), capabilities);
		driver.navigate().to("https://www.google.com");
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(".\\screenshot1.jpg"));
		//System.out.println(SeleniumManager.getInstance().getDriverPath("chromedriver"));
	}

}
