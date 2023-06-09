package Story;

import java.util.ArrayList;

public class StoryLinedAdaperImp implements IStoryLineAdapter {

	IStoryLine s;
	@Override
	public ArrayList<Story> getStoryLine() {
		return s.getSts();
	}
	@Override
	public void createStoryLine(StoryLine s) {
		this.s = s;
	}


}
