package Model.Item;

import Model.Character.Hero;

public class p_Sp extends Portion{

	public p_Sp(int useage, boolean haveskill)
	{
		ID = "p5";
		name = "이동속도포션";
		this.useage = useage;
		this.haveskill = haveskill;
		money = 100;
		lv = 1;
	}
	
	public void effect(Hero h)
	{
		h.setSpeed(h.getSpeed()+1);
	}
}
