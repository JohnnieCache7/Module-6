import java.util.List;

import controller.ShopperHelper;
import model.Shopper;

/**
 * Jonathan Argueta-Herrera - jiarguetaherrera CIS175 Fall 2023 Aug, 30
 */
public class ShopperTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Shopper jonathan = new Shopper("Jonathan");
		ShopperHelper sh = new ShopperHelper();

		Shopper psalm = new Shopper("Psalm");
		
		sh.insertShopper(jonathan);
		sh.insertShopper(psalm);
		
		List<Shopper> allShoppers = sh.showAllShoppers();
		
		for (Shopper a: allShoppers) {
		System.out.println(a.toString());

		}
	}
}
