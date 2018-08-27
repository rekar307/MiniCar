package Model.Item;

import Model.Character.Hero;

public class t_Armor extends defenseItem{

	public t_Armor(int useage, boolean haveskill, int lv)
	{
		ID = "d4";
		name = "≈‰∏£∞©ø ";
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
