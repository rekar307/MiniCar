package Model.Factory;

import Model.Item.*;

public class DItemManager extends ItemManager{

	@Override
	public Item createItem(String ID,int lv) {
		if(ID.endsWith("1"))
			return new c_Tise(0,false,lv);
		else if(ID.endsWith("2"))
			return new h_Pants(0,false,lv);
		else if(ID.endsWith("3"))
			return new i_Bodysuit(0,false,lv);
		else if(ID.endsWith("4"))
			return new t_Armor(0,false,lv);
		return null;
	}

}
