package org.Docker.ParallelSelenium.org.Docker.ParallelSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseClass {
	
	public static void main(String args[]) {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		WebDriver driver = new RemoteWebDriver(capabilities);
		
	}

}
