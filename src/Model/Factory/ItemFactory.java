package Model.Factory;

import Model.Item.*;

public class ItemFactory implements ItemFactory_IF{

	public ItemManager createManager(String ID,int lv)
	{
		if(ID.startsWith("a"))
			return new AItemManager();
		else if(ID.startsWith("d"))
			return new DItemManager();
		else if(ID.startsWith("s"))
			return new SItemManager();
		else if(ID.startsWith("h"))
			return new HItemManager();
		else if(ID.startsWith("k"))
			return new KItemManager();
		else if(ID.startsWith("p"))
			return new PItemManager();
		return null;
	}

	@Override
	public Item createItem(String ID,int lv) {
		// TODO Auto-generated method stub
		return createManager(ID,lv).createItem(ID,lv);
	}
}
