package mob;

import aventuregame.Things;
import aventuregame.combat;
import skill.Skill;

public abstract class Mob extends Things {

	int expgain;
	int goldDrop;

	@Override
	public int getThingsDame(Things c , boolean isCrit ) {
		int rs=0;
		if (isCrit== true) {
			rs= this.getDame() * 2;
		}else
		{
			rs= this.getDame() - c.getArmor();
		}
		return rs;
	}

	public boolean CrittcalHit() {
		return mecanich.Mecanich.checkCritical(30);

	}

	public int getExpgain() {
		return expgain;
	}

	public void setExpgain(int expgain) {
		this.expgain = expgain;
	}

	public int getGoldDrop() {
		return goldDrop;
	}

	public void setGoldDrop(int goldDrop) {
		this.goldDrop = goldDrop;
	}

	@Override
	public void normalAttack(Things c , int dame) {
		if (!c.checkalive()) {
			int rs = c.getHealPoint() - dame;
			c.setHealPoint(rs);
			c.checkalive();
		} else
			System.out.println("nguoi choi da chet");
	}

	@Override
	public void specialAttack(Things C, Skill s) {
		// TODO Auto-generated method stub

	}

}
