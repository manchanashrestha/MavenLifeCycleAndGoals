package MavenProjectGroup.MavenLifeCycleAndGoals;

import static org.testng.Assert.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	WebDriver driver;
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
    	System.out.println("Asserting Tue Test");

        assertTrue( true );
    }

    @Test
    public void shouldAnswerWithFalse()
    {
    	System.out.println("Asserting False Test");

        assertFalse(false);
    }

    
    @BeforeTest
    public void GetStartwithBrowser()
    {
    	System.out.println("Initliazing the Browser");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.google.com");
    	
    }
    
    @AfterTest
    public void CloseBrowser()
    {
    	System.out.println("Closing Browser");

    	driver.close();
    }
}