package Model.Character;

import java.util.ArrayList;

import Model.Item.Item;

public class Captain extends Hero{

	public Captain(){
		lv = 1;
		id = "h1";
		HeroInfo.setInfo(this);
		name = "ĸƾ �Ƹ޸�ī";
		money=1000;
		backpack = new ArrayList<Item>();
		itemIndex=0;
		exp = 0;
		x = 200;
		y = 200;
	}
}
