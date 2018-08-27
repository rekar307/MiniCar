package Model.Factory;

import Model.Item.*;

public class HItemManager extends ItemManager{

	@Override
	public Item createItem(String ID,int lv) {
		if(ID.endsWith("1"))
			return new c_Helmet(0,false,lv);
		else if(ID.endsWith("2"))
			return new h_Belt(0,false,lv);
		else if(ID.endsWith("3"))
			return new i_Headsuit(0,false,lv);
		else if(ID.endsWith("4"))
			return new t_Helmet(0,false,lv);
		return null;
	}

}
