package Model.Item;

import Model.Character.Hero;

public class h_Bike extends speedItem{

	public h_Bike(int useage, boolean haveskill, int lv)
	{
		ID = "s2";
		name = "ÇæÅ©ÀÚÀü°Å";
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
