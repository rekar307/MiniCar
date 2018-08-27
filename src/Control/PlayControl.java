package Control;

import processing.core.PApplet;
import processing.core.PImage;
import Model.Item.SkillItem;
import Model.Shop.Shop;
import Model.Character.*;

public class PlayControl {

	private HeroControl hc;
	private EnemyControl[][] ec;
	private ShopControl sc;

	private PApplet p;

	private PImage skill[];
	private PImage hero;
	private PImage attacked_h;
	private PImage normal_h;
	private PImage[][] enemy;
	private PImage[] attacked_e;
	private PImage[] normal_e;
	private PImage goal_move;

	private boolean skillVisible = false;
	private static int cooltime = 301;
	private int skillIndex;

	public PlayControl(String ID, PApplet p) {

		this.p = p;
		makeHero(ID);

		Shop s = new Shop();
		this.sc = new ShopControl(hc.getH(), s);
		this.ec = new EnemyControl[6][];

		goal_move = p.loadImage("Goal.png");

		enemy = new PImage[6][15];
		attacked_e = new PImage[6];
		normal_e = new PImage[6];

		normal_e[0] = p.loadImage("Thief.png");
		attacked_e[0] = p.loadImage("Thief_a.png");
		normal_e[1] = p.loadImage("Murderer.png");
		attacked_e[1] = p.loadImage("Murderer_a.png");
		normal_e[2] = p.loadImage("Mapia.png");
		attacked_e[2] = p.loadImage("Mapia_a.png");
		normal_e[3] = p.loadImage("SmallBoss.png");
		attacked_e[3] = p.loadImage("SmallBoss_a.png");
		normal_e[4] = p.loadImage("MiddleBoss.png");
		attacked_e[4] = p.loadImage("MiddleBoss_a.png");
		normal_e[5] = p.loadImage("BigBoss.png");
		attacked_e[5] = p.loadImage("BigBoss_a.png");

		MakeEnemy me = new MakeEnemy(this.ec, this);
		Thread obj = new Thread(me);
		obj.start();

		for (int j = 0; j < 15; j++)
			enemy[0][j] = normal_e[0];
		for (int j = 0; j < 10; j++)
			enemy[1][j] = normal_e[1];
		for (int j = 0; j < 7; j++)
			enemy[2][j] = normal_e[2];
		for (int j = 0; j < 5; j++)
			enemy[3][j] = normal_e[3];
		for (int j = 0; j < 3; j++)
			enemy[4][j] = normal_e[4];
		for (int j = 0; j < 1; j++)
			enemy[5][j] = normal_e[5];
	}

	public HeroControl getHc() {
		return hc;
	}

	public void setHc(HeroControl hc) {
		this.hc = hc;
	}

	public boolean isSkillVisible() {
		return skillVisible;
	}

	public void setSkillVisible(boolean skillVisible) {
		this.skillVisible = skillVisible;
	}

	public EnemyControl[][] getEC() {
		return ec;
	}

	public void setHeroI(PImage p) {
		normal_h = p;
	}

	public void setAHeroI(PImage p) {
		attacked_h = p;
	}

	public void makeHero(String ID) {
		if (ID.endsWith("1")) {
			hc = new HeroControl(new Captain());
			normal_h = p.loadImage("Captin.png");
			attacked_h = p.loadImage("Captin_a.png");
			hero = normal_h;
		}

		else if (ID.endsWith("2")) {
			hc = new HeroControl(new Hulk());
			normal_h = p.loadImage("Hulk.png");
			attacked_h = p.loadImage("Hulk_a.png");
			hero = normal_h;
		}

		else if (ID.endsWith("3")) {
			hc = new HeroControl(new Iron());
			normal_h = p.loadImage("Iron.png");
			attacked_h = p.loadImage("Iron_a.png");
			hero = normal_h;
		}

		else if (ID.endsWith("4")) {
			hc = new HeroControl(new Thor());
			normal_h = p.loadImage("Thor.png");
			attacked_h = p.loadImage("Thor_a.png");
			hero = normal_h;
		}

	}

	public void showHero() {
		if (hc.getH().getHP() >= 0)
			p.image(hero, hc.getH().getX() - 15, hc.getH().getY() - 22);
	}

	public void showEnemy() {
		for (int i = 0; i < ec.length; i++) {
			for (int j = 0; j < ec[i].length; j++) {
				if (ec[i][j] != null && ec[i][j].getE() != null
						&& ec[i][j].getE().getHP() >= 0) {
					p.image(enemy[i][j], ec[i][j].getE().getX()
							- ec[i][j].getE().getWidth(), ec[i][j].getE()
							.getY() - ec[i][j].getE().getHeight());
				} else if (ec[i][j] != null && ec[i][j].getE() != null
						&& ec[i][j].getE().getHP() <= 0) {
					hc.getH().setMoney(
							hc.getH().getMoney()
									+ (int) (ec[i][j].getE().getMoney()));
					hc.getH().setExp(
							hc.getH().getExp()
									+ (int) (ec[i][j].getE().getExp()));
					ec[i][j].setE(null);
				}
			}
		}
	}

	public void showSkill() {
		if (skillVisible == true) {
			SkillItem s = ((SkillItem) hc.getH().getBackpack().get(skillIndex));
			p.image(s.getS(), s.getX(), s.getY());
			s.skillAttack();
		}
	}

	public void returnNormal_e() {
		for (int i = 0; i < ec.length; i++) {
			for (int j = 0; j < ec[i].length; j++) {
				if (ec[i][j] != null && ec[i][j].getE() != null)
					enemy[i][j] = normal_e[i];
			}
		}

	}

	public void heroAttack(float ax, float ay) {
		hc.setAx(ax);
		hc.setAy(ay);

		for (int i = 0; i < ec.length; i++) {
			for (int j = 0; j < ec[i].length; j++) {
				if (ec[i][j] != null
						&& ec[i][j].getE() != null
						&& hc.attack(ec[i][j].getE(), (ec[i][j].getE()
								.getWidth() + ec[i][j].getE().getHeight())
								/ 2
								+ 18 + hc.getH().getRange()) == true) {
					enemy[i][j] = attacked_e[i];
					this.levelCheck();
				}
			}
		}
	}

	public void enemyAttack() {
		boolean check = false; // 공격 당함 true
		for (int i = 0; i < ec.length; i++) {
			for (int j = 0; j < ec[i].length; j++) {
				if (ec[i][j] != null
						&& cooltime > 100
						&& ec[i][j].getE() != null
						&& ec[i][j].attack(hc.getH(), ec[i][j].getE()
								.getRange()) == true) {
					hero = attacked_h;
					check = true;
					cooltime = 0;
					break;
				}
				if (check == false) {
					hero = normal_h;
				}
			}
		}
		cooltime++;
	}

	public void heroMove(float dx, float dy) {
		p.image(goal_move, dx, dy);
		hc.setDx(dx);
		hc.setDy(dy);
		Thread heromove = new Thread(hc);
		heromove.start();
	}

	public void enemyMove() {
		Thread[][] enemymove = new Thread[6][15];

		for (int i = 0; i < ec.length; i++) {
			for (int j = 0; j < ec[i].length; j++) {
				if (enemymove[i][j] == null && ec[i][j] != null
						&& ec[i][j].getE() != null) {
					enemymove[i][j] = new Thread(ec[i][j]);
					enemymove[i][j].start();
				} else if (enemymove[i][j] != null && ec[i][j] != null
						&& ec[i][j].getE() == null)
					enemymove[i][j].interrupt();
			}
		}
	}

	public void heroItem(int i) {
		if (hc.getH().getBackpack().size()-1 >= i) {
			if (hc.getH().getBackpack().get(i) != null) {
				if (hc.getH().getBackpack().get(i).isHaveskill() == true) {
					heroSkill(i);
					skillIndex = i;
				} else
					hc.getH().useItem(i);
			}
		}else
			ViewControl.s = "아이템이 없습니다.";
	}

	public void heroSkill(int index) {
		SkillItem i = ((SkillItem) hc.getH().getBackpack().get(index));
		if (hc.getH().getMP() - i.getMana() > 0) {
			i.skill(p, this);
			hc.getH().setMP(hc.getH().getMP() - i.getMana());
			Thread obj = new Thread(i);
			obj.start();
		} else {
			ViewControl.s = "마나가 부족합니다.";
			System.out.println("마나가 부족합니다.");
		}
	}

	public ShopControl showShop() {
		hc.getH().goShop();
		return sc;
	}

	public void levelUp() {
		for (int i = 0; i < hc.getH().getItemIndex(); i++)
			hc.getH().getBackpack().get(i).effect(hc.getH());
	}

	private void levelCheck() {

		if (hc.getH().getId().endsWith("1")) {
			for (int i = 1; i < 9; i++) {
				if (HeroInfo.c_info[i][4] <= hc.getH().getExp()
						&& hc.getH().getExp() < HeroInfo.c_info[i + 1][4]) {
					hc.getH().setLv(i + 1);
					HeroInfo.setInfo(hc.getH());
					levelUp();
				}
				if (hc.getH().getExp() >= HeroInfo.c_info[9][4])
					hc.getH().setLv(10);
			}
		} else if (hc.getH().getId().endsWith("2")) {
			for (int i = 1; i < 9; i++) {
				if (HeroInfo.h_info[i][4] <= hc.getH().getExp()
						&& hc.getH().getExp() < HeroInfo.h_info[i + 1][4]) {
					hc.getH().setLv(i + 1);
					HeroInfo.setInfo(hc.getH());
					levelUp();
				}
				if (hc.getH().getExp() >= HeroInfo.h_info[9][4])
					hc.getH().setLv(10);
			}
		} else if (hc.getH().getId().endsWith("3")) {
			for (int i = 1; i < 9; i++) {
				if (HeroInfo.i_info[i][4] <= hc.getH().getExp()
						&& hc.getH().getExp() < HeroInfo.i_info[i + 1][4]) {
					hc.getH().setLv(i + 1);
					HeroInfo.setInfo(hc.getH());
					levelUp();
				}
				if (hc.getH().getExp() >= HeroInfo.i_info[9][4])
					hc.getH().setLv(10);
			}
		} else if (hc.getH().getId().endsWith("4")) {
			for (int i = 1; i < 9; i++) {
				if (HeroInfo.t_info[i][4] <= hc.getH().getExp()
						&& hc.getH().getExp() < HeroInfo.t_info[i + 1][4]) {
					hc.getH().setLv(i + 1);
					HeroInfo.setInfo(hc.getH());
					levelUp();
				}
				if (hc.getH().getExp() >= HeroInfo.t_info[9][4])
					hc.getH().setLv(10);
			}
		}
	}

	public void theEnd() {
		
		if (hc.getH().getHP() <= 0) {
			p.textSize(50);
			p.text("패배하였습니다.", 600, 200);
			ViewControl.s = "패배하였습니다.";
		} else if (hc.getH().getExp() >= 4715) {
			p.textSize(50);
			p.text("승리하였습니다.", 600, 200);
			ViewControl.s = "승리하였습니다.";
		}
	}
}
