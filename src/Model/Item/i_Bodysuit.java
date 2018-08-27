package Model.Item;

import Model.Character.Hero;

public class i_Bodysuit extends defenseItem{

	public i_Bodysuit(int useage, boolean haveskill, int lv)
	{
		ID = "d3";
		name = "¾ÆÀÌ¾ğ¸Ç¸öÅë½´Æ®";
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
