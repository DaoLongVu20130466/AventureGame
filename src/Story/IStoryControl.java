package Story;

import aventuregame.Things;
import mob.Mob;

public interface IStoryControl {

	public void controlStory(Story s);
	public void attackControl(Things hero, Mob mob, int index);
	public void runControl(Things hero, Mob mob, int index);
}
