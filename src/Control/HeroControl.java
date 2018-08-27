package Control;

import processing.core.PApplet;
import Model.Character.Enemy;
import Model.Character.Hero;

public class HeroControl implements Runnable{
	
	
	private Hero h;
	private float dx;
	private float dy;
	private float ax;
	private float ay;
	
	public HeroControl(Hero h)
	{
		this.h = h;
		dx = h.getX();
		dy = h.getY();
	}

	public Hero getH() {
		return h;
	}

	public void setH(Hero h) {
		this.h = h;
	}

	public float getDx() {
		return dx;
	}

	public void setDx(float dx) {
		this.dx = dx;
	}

	public float getDy() {
		return dy;
	}

	public void setDy(float dy) {
		this.dy = dy;
	}

	public float getAx() {
		return ax;
	}

	public void setAx(float ax) {
		this.ax = ax;
	}

	public float getAy() {
		return ay;
	}

	public void setAy(float ay) {
		this.ay = ay;
	}

	public boolean attack(Enemy e, float range)
	{
		return h.attack(e, getAx(), getAy(), range);
	}

	public synchronized void run() {
		// TODO Auto-generated method stub
		try
		{
			while(true)
			{
				if(getH().getX() != getDx() || getH().getY() != getDy())
				{
					h.move(dx, dy);
				}		
				Thread.sleep((long) (1000/h.getSpeed()));
			}
		}catch(InterruptedException e){
			return;
		}
	}

}
