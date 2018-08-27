package Model.Item;

import processing.core.PApplet;
import Control.PlayControl;
import Control.ViewControl;
import Model.Character.Character;
import Model.Character.Enemy;

public class c_Shield extends SkillItem{

	public c_Shield(int useage, boolean haveskill, int lv)
	{
		ID = "k1";
		name = "캡틴방패";
		this.useage = useage;
		this.haveskill = haveskill;
		this.lv = lv;
		setMoney();
		setMana();
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

	public void skill(PApplet p, PlayControl pc) {
		ViewControl.s = "방패 던지기";
		System.out.println("방패 던지기");
		this.p = p;
		this.pc = pc;
		this.s = p.loadImage("Shield.png");
		x = pc.getHc().getH().getX();
		y = pc.getHc().getH().getY();
		mx = p.pmouseX;
		my = p.pmouseY;
		pc.setSkillVisible(true);
	}

	public void skillMove(float mx, float my) {
		int size = (int) (Math.sqrt(((mx - x)) * ((mx - x))
				+ ((my - y) * (my - y))) / 30);
		if (size > 0) {
			setX(x + ((mx - x) / size));
			setY(y + ((my - y) / size));
		}
	}

	private boolean attack(Character c, float mx, float my, float range) {
		// TODO Auto-generated method stub
		Enemy e = (Enemy) c;
		if (Math.sqrt((mx - e.getX()) * (mx - e.getX()) + (my - e.getY())
				* (my - e.getY())) <= range) {
			if (100 - e.getDefense() > 0) {
				e.setHP(e.getHP() - ((pc.getHc().getH().getDemage()+getLv()*3) - e.getDefense()));
				return true;
			}
		}
		return false;
	}

	public void skillAttack() {
		if (pc.isSkillVisible() == true) {
			for (int i = 0; i < pc.getEC().length; i++) {
				for (int j = 0; j < pc.getEC()[i].length; j++) {
					if (pc.getEC()[i][j] != null && pc.getEC()[i][j].getE() != null) {
						if(attack(pc.getEC()[i][j].getE(), getX(), getY(), 12))
							pc.setSkillVisible(false);
					}
				}
			}
		}
	}

	public synchronized void run() {
		try {
			while (x != mx || y != my) {
				skillMove(mx, my);
				Thread.sleep(100);
			}
			pc.setSkillVisible(false);
		} catch (InterruptedException e) {
			return;
		}
	}
}
