package org.Docker.ParallelSelenium.org.Docker.ParallelSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.service.DriverService;

public class BaseClass {
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Ramesh\\Selenium\\ChromeDriver\\106.0.5249.61\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println(SeleniumManager.getInstance().getDriverPath("chromedriver"));
		
	}

}
