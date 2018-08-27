package Control;

import Model.Character.Enemy;
import Model.Character.Hero;

public class EnemyControl implements Runnable{
	
	private Enemy e;
	private float dx;
	private float dy;

	public EnemyControl(Enemy e)
	{
		this.e = e;
		dx = e.getX();
		dy = e.getY();
	}
	public Enemy getE() {
		return e;
	}
	public void setE(Enemy e) {
		this.e = e;
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
	
	public boolean attack(Hero h, float range)
	{
		return e.attack(h, h.getX(), h.getY(), 16+15-range);
	}
	
	public synchronized void run() {
	      // TODO Auto-generated method stub
	      boolean check = true;
	      try
	      {
	         while(check == true)
	         {
	            int rand = (int)(Math.random()*4);
	            
	            if(getE() != null)
	            {
	               if(getE().getX() >= getE().getWidth() && getE().getX() <= (1016 - getE().getWidth()) && getE().getY() >= getE().getHeight() && getE().getY() <= (495 - getE().getHeight()))
	               {
	                  if(rand == 0)
	                     setDx(getDx()+5);
	                  else if(rand == 1)
	                     setDx(getDx()-5);
	                  if(rand == 2)
	                     setDy(getDy()+5);
	                  else if(rand == 3)
	                     setDy(getDy()-5);
	               }
	               if (e.getX() < getE().getWidth())
	                  setDx(getDx()+5);
	               if (e.getX() > (1016 - getE().getWidth()))
	                  setDx(getDx()-5);
	               if (e.getY() < getE().getHeight())
	                  setDy(getDy()+5);
	               if (e.getY() > (495 - getE().getHeight()))
	                  setDy(getDy()-5);
	                  
	               e.move(dx, dy);
	               
	               Thread.sleep(200);
	            }
	            else
	               check = false;
	         }
	      }catch(InterruptedException e){
	         return;
	      }
	   }

}
