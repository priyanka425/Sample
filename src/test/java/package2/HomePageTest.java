package package2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
import package1.BasePage;
import package1.HomePage;

public class HomePageTest {

	HomePage homePage;
	BasePage bp;

	public HomePageTest() {
		homePage = new HomePage();
		bp = new BasePage();
	}

	@Test
	public void verifytabs() {
		Assert.assertTrue(bp.elementFound(homePage.getWomenmenu()), "Failed");
		Assert.assertTrue(bp.elementFound(homePage.getDressesmenu()));
		Assert.assertTrue(bp.elementFound(homePage.getTShirtmenu()));
	}

	@Test
	public void verifynavigation() {
		Assert.assertTrue(bp.elementFound(homePage.getWomennavigation()));
		Assert.assertTrue(bp.elementFound(homePage.getDressnavigation()));
		Assert.assertTrue(bp.elementFound(homePage.getTshirtnavigation()));
	}
	
	
	@Test(enabled = true)
	public void checkEmailSubscription() {
		homePage.getsubscription();
		Assert.assertTrue(homePage.getSubscriptionMessage().contains("successfully"));
	}

	@Test
	public void verifysizetabs() {
		
		Assert.assertTrue(bp.elementFound(homePage.getsmall()));
		Assert.assertTrue(bp.elementFound(homePage.getmedium()));
		Assert.assertTrue(bp.elementFound(homePage.getlarge()));
	}
	
		
	}
	

