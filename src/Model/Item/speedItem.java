package Model.Item;

import Model.Character.Hero;

public class speedItem extends Item{

	protected void setMoney(){
		setMoney(150+((getLv()-1)*50));
	}
	
	public void effect(Hero h,int a)
	{
		h.setSpeed(h.getSpeed()+a*getLv());
	}
	
	public void diseffect(Hero h,int a)
	{
		h.setSpeed(h.getSpeed()-a*getLv());
	}
}
