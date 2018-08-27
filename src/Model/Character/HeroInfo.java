package Model.Character;

public class HeroInfo {
	
	// 체력 마나 공격력 방어력 경험치 이동속도
		public static float[][] c_info = { { 120, 54, 6, 8, 0, 8},
									{ 144, 64, 8, 12, 30, 9},
									{ 195, 87, 11, 17, 60, 10},
									{ 287, 129, 15, 23, 90, 12},
									{ 437, 199, 20, 30, 120, 14},
									{ 665, 307, 26, 38, 150, 16},
									{ 994, 464, 33, 47, 180, 17},
									{ 1450, 684, 41, 57, 210, 18},
									{ 2053, 977, 50, 60, 240, 18},
									{ 2823, 1352, 60, 77, 270, 18} };

		// 체력 마나 공격력 방어력 경험치 이동속도 
		public static float[][] h_info = { { 80, 40, 5, 6, 0, 8},
							 { 96, 48, 6, 9, 40, 9},
							 { 130, 65, 8, 13, 70, 10},
							 { 191, 96, 11, 18, 100, 11},
							 { 291, 146, 15, 24, 130, 12,},
							 { 433, 222, 20, 31, 160, 13},
							 { 663, 331, 26, 39, 190, 14},
							 { 967, 483, 33, 48, 220, 15},
							 { 1369, 684, 41, 57, 250, 15},
							 { 1882, 941, 50, 66, 280, 15} };

		// 체력 마나 공격력 방어력 경험치 이동속도
		public static float i_info[][] = { { 96, 69, 5, 5, 0, 10},
							 { 115, 84, 6, 7, 30, 12},
							 { 156, 114, 9, 80, 60, 14},
							 { 230, 167, 12, 110, 90, 15},
							 { 350, 251, 16, 18, 120, 17},
							 { 532, 377, 21, 23, 150, 19},
							 { 795, 558, 26, 28, 180, 21},
							 { 1160, 808, 33, 34, 210, 22},
							 { 1642, 1135, 40, 40, 240, 23},
							 { 2258, 1552, 48, 46, 270, 24} };

		// 체력 마나 공격력 방어력 경험치 이동속도
		public static float t_info[][] = { { 84, 101, 7, 6, 0, 9},
							 { 101, 121, 9, 10, 50, 11},
							 { 137, 164, 12, 14, 80, 12},
							 { 201, 241, 17, 18, 110, 14},
							 { 306, 367, 22, 24, 140, 15},
							 { 466, 559, 29, 30, 170, 17},
							 { 696, 835, 36, 38, 200, 18},
							 { 1015, 1218, 45, 46, 230, 18},
							 { 1437, 1725, 55, 54, 260, 19},
							 { 1976, 2371, 66, 62, 290, 19} };
	
	public static void setInfo(Hero h){
		if(h.getId().endsWith("1"))
			setC(h);
		else if(h.getId().endsWith("2"))
			setH(h);
		else if(h.getId().endsWith("3"))
			setI(h);
		else if(h.getId().endsWith("4"))
			setT(h);
			
	}
	
	private static void setC(Hero h){
		int lv = h.getLv();
			h.setHP(c_info[lv-1][0]);
			h.setMP(c_info[lv-1][1]);
			h.setDemage(c_info[lv-1][2]);
			h.setDefense(c_info[lv-1][3]);
			h.setSpeed(c_info[lv-1][5]);
	}
	
	private static void setH(Hero h){
		int lv = h.getLv();
		h.setHP(h_info[lv-1][0]);
		h.setMP(h_info[lv-1][1]);
		h.setDemage(h_info[lv-1][2]);
		h.setDefense(h_info[lv-1][3]);
		h.setSpeed(h_info[lv-1][5]);
	}
	
	private static void setI(Hero h){
		int lv = h.getLv();
		h.setHP(i_info[lv-1][0]);
		h.setMP(i_info[lv-1][1]);
		h.setDemage(i_info[lv-1][2]);
		h.setDefense(i_info[lv-1][3]);
		h.setSpeed(i_info[lv-1][5]);
	}
	
	private static void setT(Hero h){
		int lv = h.getLv();
		h.setHP(t_info[lv-1][0]);
		h.setMP(t_info[lv-1][1]);
		h.setDemage(t_info[lv-1][2]);
		h.setDefense(t_info[lv-1][3]);
		h.setSpeed(t_info[lv-1][5]);
	}
}
