package Model.Item;

import Model.Character.Hero;

public class demageItem extends Item{
	protected void setMoney(){
		setMoney(150+((getLv()-1)*60));
	}
	
	public void effect(Hero h,int a)
	{
		h.setDemage(h.getDemage()+a*getLv());
	}
	
	public void diseffect(Hero h,int a)
	{
		h.setDemage(h.getDemage()-a*getLv());
	}
}
