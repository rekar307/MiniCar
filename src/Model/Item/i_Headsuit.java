package Model.Item;

import Model.Character.Hero;

public class i_Headsuit extends hpItem{

	public i_Headsuit(int useage, boolean haveskill, int lv)
	{
		ID = "h3";
		name = "���̾�ǿ��ڷ�";
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
