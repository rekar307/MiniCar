package Control;

import Model.Character.*;

public class MakeEnemy implements Runnable{
	
	private EnemyControl[][] ec = {{null,null,null,null,null,null,null,null,null,null,null,null,null,null,null},
									{null,null,null,null,null,null,null,null,null,null},
									{null,null,null,null,null,null,null},
									{null,null,null,null,null,},
									{null,null,null,},
									{null,}};
	private PlayControl pc;
	
	public MakeEnemy(EnemyControl[][] ec,PlayControl pc)
	{
		ec[0] = this.ec[0];
		ec[1] = this.ec[1];
		ec[2] = this.ec[2];
		ec[3] = this.ec[3];
		ec[4] = this.ec[4];
		ec[5] = this.ec[5];
		
		this.pc = pc;
	}
	
	public void run()
	{
		try
		{
			for(int i=0; i<ec.length; i++)
			{
				for(int j=0; j<ec[i].length; j++)
				{
					switch(i)
					{
					case 0 :
						ec[i][j] = new EnemyControl(new Thief());
						pc.enemyMove();
						break;
					case 1 :
						ec[i][j] = new EnemyControl(new Murderer());
						pc.enemyMove();
						break;
					case 2 :
						ec[i][j] = new EnemyControl(new Mapia());
						pc.enemyMove();
						break;
					case 3 :
						ec[i][j] = new EnemyControl(new SmallBoss());
						pc.enemyMove();
						break;
					case 4 :
						ec[i][j] = new EnemyControl(new MiddleBoss());
						pc.enemyMove();
						break;
					case 5 :
						ec[i][j] = new EnemyControl(new BigBoss());
						pc.enemyMove();
						break;
					}
						
				}
				Thread.sleep(10000);
			}
		}catch(InterruptedException e){
			return;
		}
	}
}
