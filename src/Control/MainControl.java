package Control;

import processing.core.PApplet;
import Model.Character.*;
import Model.Shop.Shop;
import View.*;

public class MainControl extends PApplet {

	public PlayControl pc;
	ViewControl vc;
	View_Play vp;
	String heroID;
	
	public MainControl(String ID, View_Play vp){
		this.vp = vp;
		heroID = ID;
	}

	public void setup() {
		pc = new PlayControl(heroID,this);
		vc = new ViewControl(pc.getHc().getH(), vp);
		size(1300, 495);
	}

	public void draw() {
		background(255);
		pc.showHero();
		pc.showEnemy();
		pc.showSkill();
		pc.enemyAttack();
		vc.upDateStat();
		pc.theEnd();
	}

	public void mousePressed() {
		if (mouseButton == LEFT) {
			pc.heroMove(mouseX, mouseY);
		} else if (mouseButton == RIGHT) {
			pc.heroAttack(mouseX, mouseY);
		}
	}

	public void mouseReleased() {
		pc.returnNormal_e();
	}

	public void keyPressed() {
		if (keyCode == '1')
			pc.heroItem(0);
		else if (keyCode == '2')
			pc.heroItem(1);
		else if (keyCode == '3')
			pc.heroItem(2);
		else if (keyCode == '4')
			pc.heroItem(3);
		else if (keyCode == '5')
			pc.heroItem(4);
		else if (keyCode == '6')
			pc.heroItem(5);
		else if (keyCode == 'M')
			pc.showShop();

	}
}
