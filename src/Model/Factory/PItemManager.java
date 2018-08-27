package Model.Factory;

import Model.Item.*;

public class PItemManager extends ItemManager {

	@Override
	public Item createItem(String ID,int lv) {
		if (ID.endsWith("1"))
			return new p_Hp(2, false);
		else if (ID.endsWith("2"))
			return new p_Mp(2, false);
		else if (ID.endsWith("3"))
			return new p_Dm(1, false);
		else if (ID.endsWith("4"))
			return new p_Df(1, false);
		else if (ID.endsWith("5"))
			return new p_Sp(1, false);
		return null;
	}

}
