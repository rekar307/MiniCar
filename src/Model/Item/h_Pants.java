package Model.Item;

import Model.Character.Hero;

public class h_Pants extends defenseItem{

	public h_Pants(int useage, boolean haveskill, int lv)
	{
		ID = "d2";
		name = "ÇæÅ©¹ÙÁö";
		this.useage = useage;
		this.haveskill = haveskill;
		this.lv = lv;
		setMoney();
	}
	
	public void effect(Hero h)
	{
		super.effect(h,3);
	}
	
	public void diseffect(Hero h)
	{
		super.diseffect(h,3);
	}
}
