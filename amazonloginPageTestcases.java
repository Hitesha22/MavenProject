package objectReposotory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class amazonloginPageTestcases {

WebDriver driver;
	
amazonloginPage obj;
	
	@BeforeMethod
	public void launchApplication() throws InterruptedException
	{
       
		System.setProperty("webdriver.chrome.driver","D:\\Software\\ChromeDriver\\chromedriver-win64\\chromedriver.exe ");
		
		 driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
	
		obj = new amazonloginPage(driver);
		
	}
	
	
		@AfterMethod
		public void closeBrowser() throws InterruptedException
		{
			Thread.sleep(3000);
			driver.close();
		}
		
		
		@Test(priority=1)
		//Verify that a registered user can SignIn successfully with Valid credentials(MouseHover action)
		

		public void VeriftthataregisteredusercanSigninsuccessfullywithValidcredentials() throws InterruptedException
		{
			
			
			obj.mousehoverElement();
			obj.Signinlink();
			Thread.sleep(4000);
			obj.enterEmail("8788592823");
			obj.continuebtn();
			obj.enterPassword("Hitesh@2296");
			obj.Submitbtn();
			driver.manage().window().maximize();
			Thread.sleep(4000);
			obj.mousehoverElementsignout();
			Thread.sleep(4000);
			obj.signoutLink();
			
		}
		
		
		@Test(priority=2)
		//Verify that error occurs when enter Incorrect User name (Get Text )
		public void VerifyThatErrorOccurswhenenterIncorrectUsername() throws InterruptedException
		
		
		{
			
			
			obj.mousehoverElement();
			obj.Signinlink();
		    Thread.sleep(4000);
			obj.enterEmail("878859282");
			obj.continuebtn();
			obj.Error();
			
		
			
			
		}
		
		@Test(priority=3)
		//Search for a Product by Name and Verify that Relevant Search Results are Displayed (DropDowm)
		public void SearchforaProductbyNameandVerifythatRelevantSearchResultsareDisplayed() throws InterruptedException
		{
			
			obj.AllCategory(15);
			Thread.sleep(4000);
		    obj.Searchbox("Apple-iPhone-12");
		    driver.manage().window().maximize();
		   obj.Searchbtn();
		   
		}  
	
		@Test(priority=4)
		//Add a Product To The Shopping Cart and Verify That It Appears In the Cart
		public void  AddaProductToTheShoppingCartandVerifyThatItAppearsIntheCart() throws InterruptedException {
			
			
			
			obj.mousehoverElement();
			obj.Signinlink();
			obj.enterEmail("8788592823");
			obj.continuebtn();
			obj.enterPassword("Hitesh@2296");
			obj.Submitbtn();
			driver.manage().window().maximize();
			Thread.sleep(4000);
            driver.get("https://www.amazon.in/Campus-Crysta-PRO-Running-Shoes/dp/B09RBGMXRJ/ref=sr_1_1_sspa?crid=2HBHCN6RF2GUK&keywords=shoes&qid=1696234569&sprefix=shoose%2Caps%2C318&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");
			Thread.sleep(4000);
		    obj.AddCart();
		    
			
			
			
		}
		
		
		@Test(priority=5)
		//Verify That the System displays a Delivery Address AND Payment while checkout
		public void  VerifyThattheSystemdisplaysaDeliveryAddressANDPaymentwhilecheckout() throws InterruptedException
		{
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			obj.mousehoverElement();
			obj.Signinlink();
			obj.enterEmail("8788592823");
			obj.continuebtn();
			obj.enterPassword("Hitesh@2296");
			obj.Submitbtn();
			driver.manage().window().maximize();
			obj.ShowCart();
		    obj.ProceedToBuy();
			obj.SelectAdress();
			
            
		}
			
		
	
		@Test(priority = 6)
		
	//	Verify Create Account Link
		public void verifyCreateAccountLink()
		{
			obj.mousehoverElement();
			obj.Signinlink();
			boolean flag = obj.isCreateaAccLinkDisplayed();
			Assert.assertEquals(flag,true);
		}
		

		@Test(priority = 7)
		//Verify forgot password Link 
		public void verifyforgotPasswordLink() throws InterruptedException
		{
			obj.mousehoverElement();
			obj.Signinlink();
			obj.enterEmail("8788592823");
			obj.continuebtn();
			obj.enterPassword("Hitesh@229");
			obj.Submitbtn();
			Thread.sleep(4000);
			boolean flag = obj.isfForgotPasswordLinkDisplayed();
			Assert.assertEquals(flag, true);
		}
			
	
		}
		
		
		
		
		
		
		

	
		
			
			
			
			
			
			
		
		
			
			
			
	
	

	


