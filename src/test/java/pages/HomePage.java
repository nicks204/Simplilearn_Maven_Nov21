package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import test.Baseclass;

public class HomePage {
	
	WebDriver driver = Baseclass.driver;
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}

}
