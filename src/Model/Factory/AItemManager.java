package Model.Factory;

import Model.Item.*;

public class AItemManager extends ItemManager{

	public Item createItem(String ID, int lv)
	{
		if(ID.endsWith("1"))
			return new c_Muscle(0,false,lv);
		else if(ID.endsWith("2"))
			return new h_Nuckle(0,false,lv);
		else if(ID.endsWith("3"))
			return new i_Arc(0,false,lv);
		else if(ID.endsWith("4"))
			return new t_Cube(0,false,lv);
		return null;
	}
}
