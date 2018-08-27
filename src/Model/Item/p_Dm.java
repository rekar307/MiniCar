package Model.Item;

import Model.Character.Hero;

public class p_Dm extends Portion{
	
	public p_Dm(int useage, boolean haveskill)
	{
		ID = "p3";
		name = "공격력포션";
		this.useage = useage;
		this.haveskill = haveskill;
		money = 100;
		lv = 1;
	}
	
	public void effect(Hero h)
	{
		h.setDemage(h.getDemage()+3);
	}
}
