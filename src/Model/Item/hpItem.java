package Model.Item;

import Model.Character.Hero;

public class hpItem extends Item{
	protected void setMoney(){
		setMoney(170+((getLv()-1)*70));
	}
	
	public void effect(Hero h,int a)
	{
		h.setHP(h.getHP()+a);
	}
	
	public void diseffect(Hero h,int a)
	{
		h.setHP(h.getHP()-a);
	}
}
