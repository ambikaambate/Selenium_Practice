package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="user_name") 
	private WebDriver usernameTesxField; 
	
	@FindBy(name="user_password")
	private WebDriver passwordTextField;
	
	@FindBy(id="submitButton")
	private WebDriver loginButton;

	public WebDriver getUsernameTesxField() {
		return usernameTesxField;
	}

	public WebDriver getPasswordTextField() {
		return passwordTextField;
	}

	public WebDriver getLoginButton() {
		return loginButton;
	}
	
	}
