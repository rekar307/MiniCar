package Model.Item;

import Model.Character.Hero;

public class i_Footsuit extends speedItem{

	public i_Footsuit(int useage, boolean haveskill, int lv)
	{
		ID = "s3";
		name = "���̾�ǹ߽�Ʈ";
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
