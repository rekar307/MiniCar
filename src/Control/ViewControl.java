package Control;

import Model.Character.Hero;
import View.*;

public class ViewControl {

	public static String s;
	public static boolean shopCheck;
	private Hero h;
	View_Play vp;
	PlayControl pc;

	public ViewControl(Hero h, View_Play vp) {
		this.h = h;
		this.vp = vp;
		shopCheck = false;
	}

	public void upDateStat() {
		showMana();
		showHealth();
		showExp();
		showMoney();
		showLevel();
		showItem();
		showItem1();
		showItem2();
		showItem3();
		showItem4();
		showItem5();
		showItem6();
		showChat();
		showStoreMoney();
	}

	public void showMana() {
		vp.setManaLabel(String.valueOf(h.getMP()));
	}

	public void showHealth() {
		vp.setHealthLabel(String.valueOf(h.getHP()));
	}

	public void showExp() {
		vp.setExpLable(String.valueOf(h.getExp()));
	}

	public void showMoney() {
		vp.setMoneyLable(String.valueOf(h.getMoney()));
	}

	public void showLevel() {
		vp.setLevelLable(String.valueOf(h.getLv()));
	}

	public void showItem()
	{
		vp.setItem1Lable("아이템1");
		vp.setItem2Lable("아이템2");
		vp.setItem3Lable("아이템3");
		vp.setItem4Lable("아이템4");
		vp.setItem5Lable("아이템5");
		vp.setItem6Lable("아이템6");
	}
	public void showItem1() {
		if (h.getBackpack().size() >= 1) {
			vp.setItem1Lable(h.getBackpack().get(0).getName());
			if (h.getBackpack().get(0).getUseage() > 0)
				vp.setItem1Lable(vp.getItem1Lable() + "("
						+ h.getBackpack().get(0).getUseage() + ")");
		}

	}

	public void showItem2() {
		if (h.getBackpack().size() >= 2) {
			vp.setItem2Lable(h.getBackpack().get(1).getName());
			if (h.getBackpack().get(1).getUseage() > 0)
				vp.setItem2Lable(vp.getItem2Lable() + "("
						+ h.getBackpack().get(1).getUseage() + ")");
		}
	}

	public void showItem3() {
		if (h.getBackpack().size() >= 3) {
			vp.setItem3Lable(h.getBackpack().get(2).getName());
			if (h.getBackpack().get(2).getUseage() > 0)
				vp.setItem3Lable(vp.getItem3Lable() + "("
						+ h.getBackpack().get(2).getUseage() + ")");
		}
	}

	public void showItem4() {
		if (h.getBackpack().size() >= 4) {
			vp.setItem4Lable(h.getBackpack().get(3).getName());
			if (h.getBackpack().get(3).getUseage() > 0)
				vp.setItem4Lable(vp.getItem4Lable() + "("
						+ h.getBackpack().get(3).getUseage() + ")");
		}
	}

	public void showItem5() {
		if (h.getBackpack().size() >= 5) {
			vp.setItem5Lable(h.getBackpack().get(4).getName());
			if (h.getBackpack().get(4).getUseage() > 0)
				vp.setItem5Lable(vp.getItem5Lable() + "("
						+ h.getBackpack().get(4).getUseage() + ")");
		}
	}

	public void showItem6() {
		if (h.getBackpack().size() >= 6) {
			vp.setItem6Lable(h.getBackpack().get(5).getName());
			if (h.getBackpack().get(5).getUseage() > 0)
				vp.setItem6Lable(vp.getItem6Lable() + "("
						+ h.getBackpack().get(5).getUseage() + ")");
		}
	}
	
	public void showChat(){
		vp.setChat(s);
	}
	
	public void showStoreMoney()
	{
		if(shopCheck == true)
			vp.getStore().setStoreMoney(Integer.toString(h.getMoney()));
	}
	
}
