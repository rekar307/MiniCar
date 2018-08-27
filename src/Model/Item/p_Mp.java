package Model.Item;

import Model.Character.Hero;

public class p_Mp extends Portion{

	public p_Mp(int useage, boolean haveskill)
	{
		ID = "p2";
		name = "마나포션";
		this.useage = useage;
		this.haveskill = haveskill;
		money = 30;
		lv = 1;
		
	}
	
	public void effect(Hero h)
	{
		h.setMP(h.getMP()+10);
	}
}
