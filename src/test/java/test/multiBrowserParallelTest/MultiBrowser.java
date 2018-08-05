package test.multiBrowserParallelTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowser
{
    WebDriver driver;
    String temp;

    @Parameters({ "browser" })
    @BeforeTest
    public void setup(String browser)
    {
	if (browser.equals("chrome"))
	{
	    System.out.println("browser passed as :- " + browser);
	    temp= browser;
	    System.setProperty("webdriver.chrome.driver",
		    "D:\\EclipseWorkspace\\pageObjectModel\\driverExecutables\\chromedriver_win32.exe");
	    driver = new ChromeDriver();
	} else if (browser.equals("firefox"))
	{
	    System.out.println("browser passed as :- " + browser);
	    temp= browser;
	    System.setProperty("webdriver.chrome.driver",
		    "D:\\EclipseWorkspace\\pageObjectModel\\driverExecutables\\chromedriver_win32.exe");
	    driver = new ChromeDriver();
	}

    }

    @Test
    public void testCaseTwo()
    {
	if(temp.equals("firefox"))
	    driver.get("https://www.google.com/");
	else if(temp.equals("chrome"))
	    driver.get("https://www.bing.com/");
    }
}
