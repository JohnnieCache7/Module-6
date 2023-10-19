import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import controller.ListDetailsHelper;
import controller.ShopperHelper;
import model.ListDetails;
import model.ListItem;
import model.Shopper;

/**
 * Jonathan Argueta-Herrera - jiarguetaherrera CIS175 Fall 2023 Aug, 30
 */
public class ListDetailsTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shopper kaleb = new Shopper("Kaleb");
		
		ListDetailsHelper ldh = new ListDetailsHelper();
		
		ListItem riceCrispy = new ListItem("VendMachine", "Rice Crispy");
		ListItem cheetos = new ListItem("VendMachine", "Cheetos");
		
		List<ListItem> kalebsItems = new ArrayList<ListItem>();
		kalebsItems.add(riceCrispy);
		kalebsItems.add(cheetos);
		
		ListDetails kalebsList = new ListDetails("Kaleb's VendingMachineList", LocalDate.now(), kaleb);
		
		kalebsList.setListOfItems(kalebsItems);
		ldh.insertNewListDetails(kalebsList);
		
		List<ListDetails> allLists = ldh.getLists();

		for (ListDetails a : allLists) {
			System.out.println(a.toString());
		}
	}

}
