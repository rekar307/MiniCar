package Model.Item;

import Model.Character.Hero;

public class Item {
	
	protected String ID;
	protected String name;
	protected int useage;
	protected boolean haveskill;
	protected int money;
	protected int lv;

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUseage() {
		return useage;
	}

	public void setUseage(int useage) {
		this.useage = useage;
	}

	public boolean isHaveskill() {
		return haveskill;
	}

	public void setHaveskill(boolean haveskill) {
		this.haveskill = haveskill;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public void effect(Hero h)
	{
		
	}
	
	public void diseffect(Hero h)
	{
		
	}
}
