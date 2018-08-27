package Model.Character;

import java.util.ArrayList;

import Model.Item.Item;

public class Thor extends Hero {

	public Thor() {
		lv = 1;
		id = "h4";
		HeroInfo.setInfo(this);
		name = "≈‰∏£";
		money = 0;
		backpack = new ArrayList<Item>();
		itemIndex = 0;
		exp = 0;
		x = 200;
		y = 200;
		
	}
	
}
