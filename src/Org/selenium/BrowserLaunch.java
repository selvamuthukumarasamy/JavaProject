package Org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserLaunch {
	public static void main(String[] args) {
		//Configure the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Selva\\Muthu\\SeleniumFirstDayTask\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//launch the browser
		driver.get("http://www.greenstechnologys.com");
		driver.get("http://www.google.com");

		//Identify current url
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String ti=driver.getTitle();
		System.out.println(ti);
	}
}
