package Model.Item;

import Model.Character.Hero;

public class defenseItem extends Item{
	protected void setMoney(){
		setMoney(130+((getLv()-1)*50));
	}
	
	public void effect(Hero h,int a)
	{
		h.setDefense(h.getDefense()+a*getLv());
	}
	
	public void diseffect(Hero h,int a)
	{
		h.setDefense(h.getDefense()-a*getLv());
	}
}
