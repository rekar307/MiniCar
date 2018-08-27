package Model.Character;

public class Enemy implements Enemy_IF{
	
	protected String id;
	protected float x;
	protected float y;
	protected float speed;
	protected float demage;
	protected float defense;
	protected float HP;
	protected float range;
	protected float exp;
	protected float money;
	protected float width;
	protected float height;
	
	public Enemy()
	{
		x = (float) ((Math.random()*(1016-(getWidth()*2)))+getWidth());
	    y = (float) ((Math.random()*(400-(getHeight()*2)))+getHeight());
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
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	public float getDemage() {
		return demage;
	}
	public void setDemage(float demage) {
		this.demage = demage;
	}
	public float getDefense() {
		return defense;
	}
	public void setDefense(float defense) {
		this.defense = defense;
	}
	public float getHP() {
		return HP;
	}
	public void setHP(float hP) {
		HP = hP;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public float getRange() {
		return range;
	}
	public void setRange(float range) {
		this.range = range;
	}
	public float getExp() {
		return exp;
	}
	public void setExp(float exp) {
		this.exp = exp;
	}
	public float getMoney() {
		return money;
	}
	public void setMoney(float money) {
		this.money = money;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	@Override
	public void move(float dx, float dy) {
		// TODO Auto-generated method stub
		setX(dx);
		setY(dy);
	}
	@Override
	public boolean attack(Character c, float mx, float my, float range) {
		// TODO Auto-generated method stub
		Hero h = (Hero)c;
		if(Math.sqrt((mx-getX())*(mx-getX())+(my-getY())*(my-getY())) <= range)
		{
			if(getDemage() - h.getDefense()>0){
				h.setHP(h.getHP() - (getDemage() - h.getDefense()));
				return true;
			}
		}
		return false;
	}
}
