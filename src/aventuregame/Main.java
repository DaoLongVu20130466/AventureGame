package aventuregame;

import java.awt.EventQueue;

import Story.IStoryControlAdapter;
import Story.IStoryLineAdapter;
import Story.StoryControl;
import Story.StoryControlAdaperImp;
import Story.StoryLine;
import Story.StoryLinedAdaperImp;
import character.Warrior;

public class Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IStoryLineAdapter storyline = new StoryLinedAdaperImp();
					storyline.createStoryLine(new StoryLine());
					MainMenuGame window = new MainMenuGame(new Warrior(),storyline);
					StoryControl s = new StoryControl(window);
					window.createStory(s);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
