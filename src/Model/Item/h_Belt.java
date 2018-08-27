package Model.Item;

import Model.Character.Hero;

public class h_Belt extends hpItem{

	public h_Belt(int useage, boolean haveskill, int lv)
	{
		ID = "h2";
		name = "«Ê≈©∫ß∆Æ";
		this.useage = useage;
		this.haveskill = haveskill;
		this.lv = lv;
		setMoney();
	}
	
	public void effect(Hero h)
	{
		super.effect(h,10);
	}
	
	public void diseffect(Hero h)
	{
		super.diseffect(h,10);
	}
}
