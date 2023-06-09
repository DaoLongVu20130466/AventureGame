package Story;

public class Story {

	protected StoryType type;
	protected String storyContent;
	protected  StoryType getType() {
		return type;
	}
	public void setType(StoryType type) {
		this.type = type;
	}
	public String getStoryContent() {
		return storyContent;
	}
	public void setStoryContent(String storyContent) {
		this.storyContent = storyContent;
	}
}
