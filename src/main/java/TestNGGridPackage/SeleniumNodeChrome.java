package TestNGGridPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import sun.security.krb5.internal.crypto.Des;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumNodeChrome {

     WebDriver driver;

    /**
     * java -jar selenium-server-standalone-3.12.0.jar -role hub
     *
     * C:\Users\x207836\Desktop\SeleniumGrid>java -Dwebdriver.chrome.driver=C:\Users\x207836\Desktop\SeleniumGrid\chromedriver.
     * exe -Dwebdriver.gecko.driver=C:\Users\x207836\Desktop\SeleniumGrid\geckodriver.exe -jar selenium-server-standalone-3.12.
     * 0.jar -role node -nub http://172.18.91.143:4444/grid/register
     */

    @Test
    public void SeleniumNodeChromeTest(){

        try {
            URL nodeUrl = new URL("http://172.18.91.143:4444/wd/hub");
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            capabilities.setBrowserName("chrome");
            capabilities.setPlatform(Platform.WINDOWS);
            driver = new RemoteWebDriver(nodeUrl,capabilities);
            driver.manage().window().maximize();

            driver.get("http://www.amazon.com");
            driver.findElement(By.linkText("Today's Deals")).click();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
