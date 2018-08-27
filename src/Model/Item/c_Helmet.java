package Model.Item;

import Model.Character.Hero;

public class c_Helmet extends hpItem{

	public c_Helmet(int useage, boolean haveskill, int lv)
	{
		ID = "h1";
		name = "Ä¸Æ¾Çï¸ä";
		this.useage = useage;
		this.haveskill = haveskill;
		this.lv = lv;
		setMoney();
	}
	
	public void effect(Hero h)
	{
		super.effect(h,12);
	}
	
	public void diseffect(Hero h)
	{
		super.diseffect(h,12);
	}
}
