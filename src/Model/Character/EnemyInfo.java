package Model.Character;

public class EnemyInfo {

	//체력  공격력 방어력 이동속도 공격거리 경험치 돈
	static float thief_info[] = {33,8,2,3,1,7,16};
	static float murderer_info[] = {70,8,5,2,1,18,24};
	static float mapia_info[] = {160,17,7,3,5,40,35};
	static float smallBoss_info[] = {670,27,15,5,3,140,170};
	static float middleBoss_info[] = {1700,67,27,4,5,670,400};
	static float bigBoss_info[] = {3400,101,44,3,6,1440,1000};
	
	public static void setInfo(Enemy e){
		if(e.getId().endsWith("1"))
			setT(e);
		else if(e.getId().endsWith("2"))
			setMu(e);
		else if(e.getId().endsWith("3"))
			setMa(e);
		else if(e.getId().endsWith("4"))
			setSb(e);
		else if(e.getId().endsWith("5"))
			setMb(e);
		else if(e.getId().endsWith("6"))
			setBb(e);
	}
	
	private static void setT(Enemy e){
			e.setHP(thief_info[0]);
			e.setDemage(thief_info[1]);
			e.setDefense(thief_info[2]);
			e.setSpeed(thief_info[3]);
			e.setRange(thief_info[4]);
			e.setExp(thief_info[5]);
			e.setMoney(thief_info[6]);
	}
	
	private static void setMu(Enemy e){
		e.setHP(murderer_info[0]);
		e.setDemage(murderer_info[1]);
		e.setDefense(murderer_info[2]);
		e.setSpeed(murderer_info[3]);
		e.setRange(murderer_info[4]);
		e.setExp(murderer_info[5]);
		e.setMoney(murderer_info[6]);
	}
	
	private static void setMa(Enemy e){
		e.setHP(mapia_info[0]);
		e.setDemage(mapia_info[1]);
		e.setDefense(mapia_info[2]);
		e.setSpeed(mapia_info[3]);
		e.setRange(mapia_info[4]);
		e.setExp(mapia_info[5]);
		e.setMoney(mapia_info[6]);
	}
	
	private static void setSb(Enemy e){
		e.setHP(smallBoss_info[0]);
		e.setDemage(smallBoss_info[1]);
		e.setDefense(smallBoss_info[2]);
		e.setSpeed(smallBoss_info[3]);
		e.setRange(smallBoss_info[4]);
		e.setExp(smallBoss_info[5]);
		e.setMoney(smallBoss_info[6]);
	}
	
	private static void setMb(Enemy e){
		e.setHP(middleBoss_info[0]);
		e.setDemage(middleBoss_info[1]);
		e.setDefense(middleBoss_info[2]);
		e.setSpeed(middleBoss_info[3]);
		e.setRange(middleBoss_info[4]);
		e.setExp(middleBoss_info[5]);
		e.setMoney(middleBoss_info[6]);
	}
	
	private static void setBb(Enemy e){
		e.setHP(bigBoss_info[0]);
		e.setDemage(bigBoss_info[1]);
		e.setDefense(bigBoss_info[2]);
		e.setSpeed(bigBoss_info[3]);
		e.setRange(bigBoss_info[4]);
		e.setExp(bigBoss_info[5]);
		e.setMoney(bigBoss_info[6]);
	}
}
