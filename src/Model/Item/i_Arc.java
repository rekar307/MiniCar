package Model.Item;

import Model.Character.Hero;

public class i_Arc extends demageItem{

	public i_Arc(int useage, boolean haveskill, int lv)
	{
		ID = "a3";
		name = "���̾�ǿ��ڷ�";
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
