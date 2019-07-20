package package1;
	
	import java.util.ArrayList;
	import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.FindBys;
	import org.openqa.selenium.support.PageFactory;

import package2.HomePageTest;

	public class HomePage extends BasePage {
		
		@FindBy(xpath = "//div/ul/li[1]/a[text()='Women']")
		private WebElement Womenmenu;
	
		@FindBy(xpath = "//div/ul/li[2]/a[text()='Dresses']")
		private WebElement Dressesmenu;
		
		@FindBy(xpath = "//div/ul/li[3]/a[text()='T-shirts']")
		private WebElement TShirtmenu;
		
		@FindBy(id = "newsletter-input")
		private WebElement mailid;
		
		@FindBy(name="submitNewsletter")
		private WebElement sendemail;
		
		@FindBy(xpath ="//*[@class='columns-container']//p[@class='alert alert-success']")
		private WebElement newsletter;
		
		
		@FindBy(className="heading-counter")
		private WebElement ProductHeader;
		
		//numbercount
		
		/*
		@FindBy(className="cat-name")
		private WebElement Womennavigation;

		@FindBy(className="subcategory-name")
		private WebElement Dressnavigation;
		
		@FindBy(className="replace-2x img-responsive")
		private WebElement Tshirtnavigation;

*/		
		
		@FindBy(xpath ="//label/a [contains (@href,'category#size-s')]")
		private WebElement small;
		
		@FindBy(xpath ="//label/a [contains (@href,'category#size-m')]")
		private WebElement medium;
		
		@FindBy(xpath ="//label/a [contains (@href,'category#size-l')]")
		private WebElement large;
		
		
		
		//Project factory for @ declaration
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		
		
		public WebElement getWomenmenu() {
			return Womenmenu;
		
		}
		
		public WebElement getDressesmenu() {
			
			return Dressesmenu;
			
		}
		
		public WebElement getTShirtmenu() {
			return TShirtmenu;
		}


		public WebElement getWomennavigation() {
			Womenmenu.click();
			return Womenmenu;
		}
		public WebElement getDressnavigation() {
			Dressesmenu.click();
			return Dressesmenu;
		}
		
		public WebElement getTshirtnavigation() {
			TShirtmenu.click();
			return TShirtmenu;
		}
		
		
		public void getsubscription() {
			int random = new Random().nextInt(500000);
			System.out.println(random);
			setText(mailid, "Automation" + random +"@gmail.com");
			sendemail.click();		
		}
		
		
		
		public String getSubscriptionMessage() {
		return newsletter.getText();
		}
	
	public WebElement getsmall() {
		Dressesmenu.click();
		return small;
	}
	public WebElement getmedium() {
		return medium;
	}
	public WebElement getlarge() {
		return large;
		
		
		
	}
	
	/*
	public int getnumbercount() {
		String text =ProductHeader.getText();
		String[] acc = text.split(" ");
		String textNumber = acc[2];
		int number = Integer.parseInt(ProductHeader.getText().split(" ")[2]);
	}
	public int getProductsCount() {
		return ProductCount.size();
	}
	*/
		
		}




