package aventuregame;

import skill.Skill;

public interface combat {
	public int getThingsDame(Things c , boolean iscrit);
	public void normalAttack(Things c, int dame) ;
	public void specialAttack(Things C, Skill s);

}
