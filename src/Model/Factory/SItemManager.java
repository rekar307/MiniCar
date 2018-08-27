package Model.Factory;

import Model.Item.*;

public class SItemManager extends ItemManager{

	@Override
	public Item createItem(String ID, int lv) {
		if(ID.endsWith("1"))
			return new c_Cape(0,false,lv);
		else if(ID.endsWith("2"))
			return new h_Bike(0,false,lv);
		else if(ID.endsWith("3"))
			return new i_Footsuit(0,false,lv);
		else if(ID.endsWith("4"))
			return new t_Cape(0,false,lv);
		return null;
	}

}
