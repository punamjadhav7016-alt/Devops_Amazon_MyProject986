package docker_Amazon;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Amazon {

    WebDriver driver;

    @Parameters({"bname"})
    @Test
    public void CrossBrowserTestforAmazonApplication(String bname)
            throws MalformedURLException, InterruptedException {

        System.out.println("Session started");

        if (bname.equals("Chrome")) {

            ChromeOptions option = new ChromeOptions();

            driver = new RemoteWebDriver(
                    new URL("http://localhost:4444"),
                    option);

            System.out.println("Session created for chrome");

        }

        else if (bname.equals("Edge")) {

            EdgeOptions option = new EdgeOptions();

            driver = new RemoteWebDriver(
                    new URL("http://localhost:4444"),
                    option);

            System.out.println("Session created for edge");

        }

        else if (bname.equals("Firefox")) {

            FirefoxOptions option = new FirefoxOptions();

            driver = new RemoteWebDriver(
                    new URL("http://localhost:4444"),
                    option);

            System.out.println("Session created for Firefox");
        }

        System.out.println("Driver session completed");
        
        System.out.println("Before URL launch");

        Thread.sleep(5000);
        driver.get("https://www.amazon.in/");
        
        System.out.println("After URL launch");

        Thread.sleep(5000);


        System.out.println(driver.getTitle());
        
        driver.quit();


    }
}