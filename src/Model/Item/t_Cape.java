package Model.Item;

import Model.Character.Hero;

public class t_Cape extends speedItem{

	public t_Cape(int useage, boolean haveskill, int lv)
	{
		ID = "s4";
		name = "≈‰∏£∏¡≈‰";
		this.useage = useage;
		this.haveskill = haveskill;
		this.lv = lv;
		setMoney();
	}
	
	public void effect(Hero h)
	{
		super.effect(h,2);
	}
	
	public void diseffect(Hero h)
	{
		super.diseffect(h,2);
	}
}
