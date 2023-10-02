package objectReposotory;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class amazonloginPage {

WebDriver driver;

@FindBy(xpath ="//*[@id=\'nav-link-accountList-nav-line-1\']" )
@CacheLookup
WebElement mousehoverElement;	

@FindBy(linkText="Sign in")
@CacheLookup
WebElement Signin;	

@FindBy(id="ap_email")
@CacheLookup
WebElement Email;

@FindBy(id="continue")
@CacheLookup
WebElement continuebtn ;

@FindBy(name="password")
@CacheLookup
WebElement password ;

@FindBy(className ="a-button-input")
@CacheLookup
WebElement submitbtn ;

@FindBy(xpath ="//*[@id=\'nav-link-accountList-nav-line-1\']" )
@CacheLookup
WebElement mousehoverElementsignout;

@FindBy(linkText ="Sign Out" )
@CacheLookup
WebElement signoutLink;

@FindBy(xpath="//*[@id='auth-error-message-box']")
@CacheLookup
WebElement Error;


@FindBy(css="select[id='searchDropdownBox']")
@CacheLookup
WebElement AllCategory;

@FindBy(xpath="//input[@id=\"twotabsearchtextbox\"]")
@CacheLookup
WebElement Searchbox;

@FindBy(xpath="//input[@id=\"nav-search-submit-button\"]")
@CacheLookup
WebElement Searchbtn;


@FindBy(css="input[id=\"add-to-cart-button\"]")
@CacheLookup
WebElement AddCart;

@FindBy(xpath="//*[@id=\"nav-cart\"]")
 @CacheLookup
 WebElement ShowCart ;
 
  @FindBy(css="input[name='proceedToRetailCheckout']")
 @CacheLookup
 WebElement ProceedToBuy ;
 
 @FindBy(xpath="//input[@data-testid='Address_selectShipToThisAddress']")
 @CacheLookup
 WebElement SelectAdress ;
 
 @FindBy(partialLinkText = "Create your Amazon account")
  @CacheLookup
	WebElement CreateaAccLink;
 
 @FindBy(linkText = "Forgot Password")
	@CacheLookup
	WebElement ForgotPasswordLink;
 
 public amazonloginPage(WebDriver driver1)
{
	driver = driver1;
	PageFactory.initElements(driver, this);
}

public void mousehoverElement() {
	// TODO Auto-generated method stub
	Actions obj = new Actions(driver);
    
     Action signinhover = obj.moveToElement(mousehoverElement).build();
     
     signinhover.perform();
}

    

public void Signinlink()
{
	Signin.click();
}

public void enterEmail(String email)
{
	Email.sendKeys(email);
}
public void continuebtn()
{
	continuebtn.click();
}

public void enterPassword(String paswd)
{
	password.sendKeys(paswd);
}

  public void Submitbtn()
{
submitbtn.click();
}

public void mousehoverElementsignout() {
	
	Actions obj = new Actions(driver);
    
     Action signouthover = obj.moveToElement(mousehoverElementsignout).build();
     
     signouthover.perform();

}

public void signoutLink() {
			
signoutLink.click();
}

public void Error()
{
  String msg = Error.getText();
	
	System.out.println(msg);
		
}


public void AllCategory(int c) 
{


Select dropDownObj1 = new Select(AllCategory);

dropDownObj1.selectByIndex(c);
}


public void Searchbox(String item) {
	
	Searchbox.sendKeys(item);
	
}

public void Searchbtn() {
	
	Searchbtn.click();
	
}
	

public void AddCart()
{ 
	AddCart.click();
	
}
public void ShowCart()
{
	ShowCart.click();
}

public void ProceedToBuy()
{
	ProceedToBuy.click();

}

public void SelectAdress()
{
	SelectAdress.click();

}

	public boolean isCreateaAccLinkDisplayed()
	{
		try
		{
		boolean status = CreateaAccLink.isDisplayed();
		return status;
		}catch(NoSuchElementException e)
		{
			System.out.println("Create account link is not displayed in Login Page");
			return false;
		}
	}
		
	public boolean isfForgotPasswordLinkDisplayed()
	{
		try
		{
		boolean status = ForgotPasswordLink.isDisplayed();
		return status;
		}catch(NoSuchElementException e)
		{
			System.out.println("Forgot password link is not displayed in Login Page");
			return false;
		}

}
}












