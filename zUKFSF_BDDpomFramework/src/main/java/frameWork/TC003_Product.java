package frameWork;

import org.testng.annotations.Test;

public class TC003_Product extends TC002_MyWishList {
	@Test
	
	public void Product() {
		
		enterByXpath("//input[@class='input-text']", "product");
		clickByXpath("(//button[@class='button'])[3]");
		clickByXpath("(//strong[@class='grid'])[1]");
		clickByLinkText("List");
		clickByXpath("(//div[@class='sort-by'])[2]");
		
	}

}
