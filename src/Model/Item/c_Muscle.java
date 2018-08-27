package Model.Item;

import Model.Character.Hero;

public class c_Muscle extends demageItem{

	public c_Muscle(int useage, boolean haveskill, int lv)
	{
		ID = "a1";
		name = "Ä¸Æ¾±ÙÀ°";
		this.useage = useage;
		this.haveskill = haveskill;
		this.lv = lv;
		setMoney();
	}
	
	public void effect(Hero h)
	{
		super.effect(h,4);
	}
	
	public void diseffect(Hero h)
	{
		super.diseffect(h,4);
	}
}
