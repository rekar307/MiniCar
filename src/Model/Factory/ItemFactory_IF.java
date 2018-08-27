package Model.Factory;

import Model.Item.*;

public interface ItemFactory_IF {

	abstract ItemManager createManager(String ID,int lv);
	
	abstract Item createItem(String ID,int lv);
}
