package Model.Item;

import Control.PlayControl;
import Control.ViewControl;
import processing.core.PApplet;

public class h_Fear extends SkillItem{

   boolean check = true;
   int count;
   
   public h_Fear(int useage, boolean haveskill, int lv)
   {
      ID = "k2";
      name = "헐크분노";
      this.useage = useage;
      this.haveskill = haveskill;
      this.lv = lv;
      setMoney();
      setMana();
   }
   
   private void effect(){
	   pc.getHc().getH().setDemage(pc.getHc().getH().getDemage()*10);
	   pc.getHc().getH().setHP(pc.getHc().getH().getHP()*2);
   }
   
   private void diseffect(){
	   pc.getHc().getH().setDemage(pc.getHc().getH().getDemage()/2);
	   pc.getHc().getH().setHP(pc.getHc().getH().getHP()/2);
   }
   
   private void change()
   {
      if(pc.getHc().getH().getId().endsWith("1"))
      {
         pc.setHeroI(p.loadImage("Captin_ch.png"));
         pc.setAHeroI(p.loadImage("Captin_ch_a.png"));
      }   
      else if(pc.getHc().getH().getId().endsWith("2"))
      {
         pc.setHeroI(p.loadImage("Hulk_ch.png"));
         pc.setAHeroI(p.loadImage("Hulk_ch_a.png"));
      }
      else if(pc.getHc().getH().getId().endsWith("3"))
      {
         pc.setHeroI(p.loadImage("Iron_ch.png"));
         pc.setAHeroI(p.loadImage("Iron_ch_a.png"));
      }
      else if(pc.getHc().getH().getId().endsWith("4"))
      {
         pc.setHeroI(p.loadImage("Thor_ch.png"));
         pc.setAHeroI(p.loadImage("Thor_ch_a.png"));
      }
   }
   
   public void returnH()
   {
      if(pc.getHc().getH().getId().endsWith("1"))
      {
         pc.setHeroI(p.loadImage("Captin.png"));
         pc.setAHeroI(p.loadImage("Captin_a.png"));
      }   
      else if(pc.getHc().getH().getId().endsWith("2"))
      {
         pc.setHeroI(p.loadImage("Hulk.png"));
         pc.setAHeroI(p.loadImage("Hulk_a.png"));
      }
      else if(pc.getHc().getH().getId().endsWith("3"))
      {
         pc.setHeroI(p.loadImage("Iron.png"));
         pc.setAHeroI(p.loadImage("Iron_a.png"));
      }
      else if(pc.getHc().getH().getId().endsWith("4"))
      {
         pc.setHeroI(p.loadImage("Thor.png"));
         pc.setAHeroI(p.loadImage("Thor_a.png"));
      }
   }
   public void skill(PApplet p, PlayControl pc)
   {
      this.p = p;
      this.pc = pc;
      ViewControl.s = "변신";
      System.out.println("변신");
      change();
      
   }
   
   public synchronized void run()
   {
      count = 0;
      effect();
      while(++count < (4000+(getLv()-1)*1300))
      {
         skill(p,pc);
      }
      returnH();
      diseffect();
   }


}