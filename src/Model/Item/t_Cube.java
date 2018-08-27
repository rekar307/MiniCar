package Model.Item;

import Model.Character.Hero;

public class t_Cube extends demageItem{

	public t_Cube(int useage, boolean haveskill, int lv)
	{
		ID = "a4";
		name = "토르큐브";
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
