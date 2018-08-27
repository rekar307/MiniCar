package Model.Character;

import java.util.ArrayList;

import Model.Item.*;

public class Iron extends Hero{
	
	public Iron(){
		lv = 1;
		id = "h3";
		HeroInfo.setInfo(this);
		name = "아이언맨";
		money=10000;
		backpack = new ArrayList<Item>();
		itemIndex=0;
		exp = 0;
		x = 200;
		y = 200;
	}


}
