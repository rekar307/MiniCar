package Model.Item;

import Model.Character.Hero;

public class p_Hp extends Portion{
	
	public p_Hp(int useage, boolean haveskill)
	{
		ID = "p1";
		name = "ü������";
		this.useage = useage;
		this.haveskill = haveskill;
		money = 30;
		lv = 1;
	}
	
	public void effect(Hero h)
	{
		h.setHP(h.getHP()+10);
	}
}
