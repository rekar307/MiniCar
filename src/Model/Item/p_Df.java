package Model.Item;

import Model.Character.Hero;

public class p_Df extends Portion{
	
	public p_Df(int useage, boolean haveskill)
	{
		ID = "p4";
		name = "��������";
		this.useage = useage;
		this.haveskill = haveskill;
		money = 100;
		lv = 1;
	}
	
	public void effect(Hero h)
	{
		h.setDefense(h.getDefense()+3);
	}
}
