package Model.Item;

import Model.Character.Hero;

public class c_Tise extends defenseItem {

	public c_Tise(int useage, boolean haveskill, int lv) {
		ID = "d1";
		name = "Ä¸Æ¾ÂÌÂÌÀÌ";
		this.useage = useage;
		this.haveskill = haveskill;
		this.lv = lv;
		setMoney();
	}
	
	public void effect(Hero h)
	{
		super.effect(h, 3);
	}
	
	public void diseffect(Hero h)
	{
		super.diseffect(h,3);
	}
}
