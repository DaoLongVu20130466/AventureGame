package Story;

import javax.swing.JFrame;

import aventuregame.IMainMenu;
import aventuregame.IMainMenuAdapter;
import aventuregame.MainMenuAdapterImp;
import aventuregame.MainMenuGame;
import aventuregame.Things;
import character.Character;
import mob.Mob;

public class StoryControl implements IStoryControl{

	IMainMenuAdapter mainMenu;
	
	public StoryControl(MainMenuGame _mainMenu) {
		mainMenu = new MainMenuAdapterImp();
		mainMenu.setMainMenu(_mainMenu);
	}
	public void setmainmenu(MainMenuGame m) {
		mainMenu.setMainMenu(m);
	}
	
	public void controlStory(Story s) {
		if(s.type == StoryType.STORY ) {
			mainMenu.printNewContent(s.getStoryContent());
			mainMenu.showMainStory();
		}
		if(s.type == StoryType.MEETMOBS) {
			mainMenu.printContent(s.storyContent);
			mainMenu.showCombat();
		}
		if(s.type == StoryType.MEETSHOP) {
			mainMenu.printContent(s.storyContent);
			mainMenu.showShop();
		}
		
	}

	public void runControl(Things hero, Mob mob, int index) {
		boolean isMobcrit = mob.CrittcalHit();
		int Mobdame = mob.getThingsDame(hero, isMobcrit);
		mob.normalAttack(hero, Mobdame);
		if (isMobcrit == true) {
			mainMenu.printContent("Trong khi bỏ chạy bạn bị " +mob.getName() +" bắn một phát chí tử" + Mobdame + " dame");
		} else {
			mainMenu.printContent("Khi bỏ chạy bạn va quẹt vào " +mob.getName() +" gây" + Mobdame + " dame");
		}
		mainMenu.checklose();
		mainMenu.resetindex();
		mainMenu.setIndex(mainMenu.getIndex()+1);
		mainMenu.showMainStory();
		
	}
	public void attackControl(Things hero, Mob mob, int index) {

		if (mainMenu.getStoryline().get(index - 1) instanceof MeetMobs) {
			boolean iscrit = mainMenu.getplayer().isCrit();
			int dame = mainMenu.getplayer().getHeroDame(mob, iscrit);
			if (iscrit == true) {
				mainMenu.printContent("Bạn đánh chí mạng được " + dame + "dame");
			} else {
				mainMenu.printContent("Bạn đánh được " + dame + "dame");
			}
			mainMenu.getplayer().heroAttack(mob, dame);

			if (mob.checkalive()) {
				mainMenu.setheroGold(mob.getGoldDrop());
				mainMenu.getplayer().gainExp(mob);
				mainMenu.printContent(mob.getName() + " Đã chết !!!");
				mainMenu.printContent(" Bạn nhận được " + String.valueOf(mob.getExpgain()) + " exp");
				if (mainMenu.getplayer().CheckLvUp()) {
					mainMenu.getplayer().LvUp();
					mainMenu.printContent("Bạn đã lên cấp !!!");
					mainMenu.getLblMaxHealPoint().setText(String.valueOf(mainMenu.setHeroHeal()));
					mainMenu.getLblExpPoint().setText(String.valueOf(mainMenu.getplayerExp()));
					mainMenu.getlblLvPoint().setText(String.valueOf(mainMenu.getplayerlv()));
					mainMenu.resetindex();
				} else {
					int expgain = Integer.parseInt(mainMenu.getLblExpPoint().getText()) + mob.getExpgain();
					mainMenu.resetindex();
				}
				mainMenu.setIndex(mainMenu.getIndex()+1);
				mainMenu.showMainStory();
			} else {
				boolean isMobcrit = mob.CrittcalHit();
				int Mobdame = mob.getThingsDame(hero, isMobcrit);
				mob.normalAttack(hero, Mobdame);
				if (isMobcrit == true) {
					mainMenu.printContent("Quái đánh chí mạng được " + Mobdame + " dame");
				} else {
					mainMenu.printContent("Quái đánh được " + Mobdame + " dame");
				}
				mainMenu.checklose();
				mainMenu.resetindex();
			}
		}
		{

		}
	}
}
