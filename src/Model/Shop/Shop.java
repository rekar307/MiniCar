package Model.Shop;

import Model.Item.Item;
import Model.Factory.*;

public class Shop {
	private Item i;
	ItemFactory_IF f = new ItemFactory();
	
	public Shop(){
		
	}

	public Item getI() {
		return i;
	}

	public void setI(Item i) {
		this.i = i;
	}
	
	public Item makeItem(String id, int lv){
		return f.createItem(id, lv);
	}
}
 