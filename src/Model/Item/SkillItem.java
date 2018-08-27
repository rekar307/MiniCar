package Model.Item;

import Control.PlayControl;
import processing.core.PApplet;
import processing.core.PImage;

public class SkillItem extends Item implements Skill,Runnable{
	
	PImage s;
	PApplet p;
	PlayControl pc;
	float x;
	float y;
	float mx;
	float my;
	float manaNeed;

	public void skill(PApplet p, PlayControl pc) {
		// TODO Auto-generated method stub
		
	}
	public float getMana(){
		return manaNeed;
	}
	
	public void setMana(){
		this.manaNeed = getLv()*6;
	}
	
	protected void setMoney(){
		setMoney(200+((getLv()-1)*70));
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

	public float getMx() {
		return mx;
	}

	public void setMx(float mx) {
		this.mx = mx;
	}

	public float getMy() {
		return my;
	}

	public void setMy(float my) {
		this.my = my;
	}

	public PImage getS() {
		return s;
	}

	public void setS(PImage s) {
		this.s = s;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	public void skillAttack(){
		
	}

}
