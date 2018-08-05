package test.multiBrowserParallelTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class BrowserHistory
{

    public static void main(String[] args)
    {
	WebDriver driver;

//	FirefoxOptions options = new FirefoxOptions();
	
	System.setProperty("webdriver.gecko.driver", "D:\\EclipseWorkspace\\pageObjectModel\\driverExecutables\\geckodriver-v0.21.0-win32.exe");
/*	
	options.setProfile(getProfile("firefoxLatest"));
	
	driver = new FirefoxDriver(options);*/
	
	driver = new FirefoxDriver();
	
	driver.get("https://www.google.com/");

    }

    private static FirefoxProfile getProfile(String profileName)
    {
	if (profileName == null || profileName.trim().isEmpty())
	{
	    return new FirefoxProfile();
	}
	return new ProfilesIni().getProfile(profileName);
    }
}
