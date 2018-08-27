package Model.Factory;

import Model.Item.*;

public class KItemManager extends ItemManager{

	@Override
	public Item createItem(String ID,int lv) {
		if(ID.endsWith("1"))
			return new c_Shield(0,true,lv);
		else if(ID.endsWith("2"))
			return new h_Fear(0,true,lv);
		else if(ID.endsWith("3"))
			return new i_Handsuit(0,true,lv);
		else if(ID.endsWith("4"))
			return new t_Hammer(0,true,lv);
		return null;
	}

}
