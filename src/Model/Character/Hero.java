package Model.Character;

import java.util.ArrayList;

import Control.ViewControl;
import Model.Item.*;

public class Hero implements Hero_IF {
	protected String name;
	protected float HP;
	protected float MP;
	protected float speed;
	protected float demage;
	protected float defense;
	protected float exp;
	protected int lv;
	protected int money;
	protected String id;
	protected ArrayList<Item> backpack;
	protected int itemIndex;
	protected float range = 5;
	protected float x;
	protected float y;

	public float getHP() {
		return HP;
	}

	public void setHP(float hP) {
		HP = hP;
	}

	public float getMP() {
		return MP;
	}

	public void setMP(float mP) {
		MP = mP;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public float getDemage() {
		return demage;
	}

	public void setDemage(float demage) {
		this.demage = demage;
	}

	public float getDefense() {
		return defense;
	}

	public void setDefense(float defense) {
		this.defense = defense;
	}

	public float getExp() {
		return exp;
	}

	public void setExp(float exp) {
		this.exp = exp;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ArrayList<Item> getBackpack() {
		return backpack;
	}

	public void setBackpack(ArrayList<Item> backpack) {
		this.backpack = backpack;
	}

	public int getItemIndex() {
		return itemIndex;
	}

	public void setItemIndex(int itemIndex) {
		this.itemIndex = itemIndex;
	}

	public float getRange() {
		return range;
	}

	public void setRange(float range) {
		this.range = range;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	@Override
	public void move(float dx, float dy) {
		// TODO Auto-generated method stub
		int size = (int) (Math.sqrt(((dx - x)) * ((dx - x))
				+ ((dy - y) * (dy - y))) / speed);
		if (size > 0) {
			setX(x + ((dx - x) / size));
			setY(y + ((dy - y) / size));
		}
	}

	@Override
	public boolean attack(Character c, float mx, float my, float range) {
		// TODO Auto-generated method stub
		Enemy e = (Enemy) c;
		if (Math.sqrt((mx - getX()) * (mx - getX()) + (my - getY())
				* (my - getY())) < range) {// 마우스클릭위치와 히어로의위치가 범위안에 있는 지
			if (Math.abs(mx - e.getX()) <= 15 && Math.abs(my - e.getY()) <= 22) {// 마우스클릭위치가
																					// 에너미
																					// 이미지
																					// 내에
																					// 있는
																					// 지
				if (getDemage() - e.getDefense() > 0) {
					e.setHP(e.getHP() - (getDemage() - e.getDefense()));
					ViewControl.s = "공격 당한 적의 HP : " + e.getHP();
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public void useItem(int index) {
		if (backpack.get(index).getUseage() > 0) {
			backpack.get(index).effect(this);
			backpack.get(index).setUseage(backpack.get(index).getUseage() - 1);
			ViewControl.s = "아이템사용";
			System.out.println("아이템사용");
		} else {
			ViewControl.s = "사용할 수 없습니다.";
			System.out.println("사용할 수 없습니다.");
		}

	}

	@Override
	public void goShop() {
	}

}
