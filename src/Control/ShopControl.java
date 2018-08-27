package Control;

import Model.Character.Hero;
import Model.Item.*;
import Model.Shop.*;

public class ShopControl {

	private Shop s;
	private Item i;
	private Hero h;
	private String id;
	private int lv;
	private boolean checklv;

	
	public ShopControl(Hero h, Shop s) {
		this.h = h;
		this.s = s;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public Item getI() {
		return i;
	}

	public void setI(Item i) {
		this.i = i;
	}

	public void setItem() {
		boolean check = false;
		if(i.getUseage()>0){
			for(int j=0; j<h.getItemIndex(); j++){
				if(h.getBackpack().get(j).getID().equals(i.getID()))
				{
					h.getBackpack().get(j).setUseage(h.getBackpack().get(j).getUseage()+i.getUseage());
					check = true;
					break;
				}
			}
		}
		if(check == false){
			h.getBackpack().add(i);
			h.setItemIndex(h.getItemIndex() + 1);
		}
		if (i.getUseage() == 0)
			i.effect(h);
	}

	public void deleteItem(int index)
	{
		h.getBackpack().remove(index);
		h.setItemIndex(h.getItemIndex() - 1);
		System.out.println("size : "+h.getBackpack().size());
	}
	
	public void buyItem() {
		if (h.getItemIndex() < 6) {
			i = s.makeItem(id, lv);
			if (h.getMoney() >= i.getMoney()) {
				if(i.getLv() == 0)
				{
					ViewControl.s = "레벨을 선택하세요";
				}
				else
				{
					h.setMoney(h.getMoney() - i.getMoney());
					this.setItem();
				}
			} else{
				ViewControl.s = "돈이 부족합니다.";
				System.out.println("돈이 부족합니다.");
			}
		} else{
			ViewControl.s = "아이템이 꽉 찼습니다.";
			System.out.println("아이템이 꽉 찼습니다.");
		}
	}

	public void setCheckLv(boolean checklv) {
		this.checklv = checklv;
	}
}