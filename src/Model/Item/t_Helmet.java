package Model.Item;

import Model.Character.Hero;

public class t_Helmet extends hpItem{

	public t_Helmet(int useage, boolean haveskill, int lv)
	{
		ID = "h4";
		name = "토르투구";
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
