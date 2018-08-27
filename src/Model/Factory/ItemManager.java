package Model.Factory;

import Model.Item.*;

public abstract class ItemManager {
	
	abstract public Item createItem(String ID,int lv);
}
