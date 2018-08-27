package Model.Character;

import java.util.ArrayList;

import Model.Item.*;

public class Hulk extends Hero{
	
	public Hulk(){
		lv = 1;
		id = "h2";
		HeroInfo.setInfo(this);
		name = "«Ê≈©";
		money=1000;
		backpack = new ArrayList<Item>();
		itemIndex=0;
		exp = 0;
		x = 200;
		y = 200;
	}

}
