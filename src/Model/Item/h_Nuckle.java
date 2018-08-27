package Model.Item;

import Model.Character.Hero;

public class h_Nuckle extends demageItem{

	public h_Nuckle(int useage, boolean haveskill, int lv)
	{
		ID = "a2";
		name = "«Ê≈©≥ ≈¨";
		this.useage = useage;
		this.haveskill = haveskill;
		this.lv = lv;
		setMoney();
	}
	
	public void effect(Hero h)
	{
		super.effect(h,5);
	}
	
	public void diseffect(Hero h)
	{
		super.diseffect(h,5);
	}
}
