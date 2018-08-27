package Model.Item;

import Model.Character.Hero;

public class c_Cape extends speedItem{

	public c_Cape(int useage, boolean haveskill, int lv)
	{
		ID = "s1";
		name = "Ä¸Æ¾¸ÁÅä";
		this.useage = useage;
		this.haveskill = haveskill;
		this.lv = lv;
		setMoney();
	}
	
	public void effect(Hero h)
	{
		super.effect(h,2);
	}
	
	public void diseffect(Hero h)
	{
		super.diseffect(h,2);
	}
}
