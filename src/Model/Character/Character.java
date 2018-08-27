package Model.Character;

public interface Character {
	  abstract void move(float dx, float dy);
	  abstract boolean attack(Character c, float mx, float my, float range);
	}
