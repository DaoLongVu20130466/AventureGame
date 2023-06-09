package Story;

import aventuregame.Things;
import mob.Mob;

public class StoryControlAdaperImp implements IStoryControlAdapter {

	IStoryControl storyControl;
	@Override
	public void controlStory(Story s) {
		storyControl.controlStory(s);
		
	}

	@Override
	public void attackControl(Things hero, Mob mob, int index) {
		storyControl.attackControl(hero, mob, index);
		
	}

	@Override
	public void runControl(Things hero, Mob mob, int index) {
		storyControl.runControl(hero, mob, index);
	}

	@Override
	public void creatStory(StoryControl s) {
		storyControl = s;
		
	}

}
