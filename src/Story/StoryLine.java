package Story;

import java.util.ArrayList;

import mecanich.TakeClass;

public class StoryLine implements IStoryLine {
	public ArrayList<Story> sts = TakeClass.TakeStory();

	@Override
	public ArrayList<Story> getSts() {
		return sts;
	}
	
}
