package aventuregame;

import java.util.ArrayList;

import javax.swing.JLabel;

import Inventory.InventoryVer2;
import Story.IStoryControlAdapter;
import Story.Story;
import Story.StoryControl;
import character.Character;
import character.IAdapterCharacter;
import mob.Mob;

public interface IMainMenu {
	public JLabel getlblLvPoint();
	public JLabel getLblExpPoint();
	public JLabel getLblMaxHealPoint();
	public void setIndex(int index);
	public int getIndex();
	public ArrayList<Story> getStoryline();
	public IAdapterCharacter getplayer();
	public void setHero(IAdapterCharacter hero);
	public void CreateHero(Character _hero);
	public void createStory(StoryControl _story);
	public int setHeroHeal();
	public int setHeroMaxHeal();
	public int setHeroMana();
	public void setheroGold(int income);
	public int setHeroAtk();
	public int setHeroAmor();
	public int getplayerlv();
	public int getplayerExp();
	public void heroattack(Mob c , int dame);
	public void LvUp() ;
	public boolean checkLvUp();
	public InventoryVer2 takeIven();
	public Character takechar();
	public void checklose();
	public void resetindex();
	public void printContent(String content);
	public void printNewContent(String content);
	public void gamestart();
	public void showCombat();
	public void showShop();
	public void showMainStory();
	public void showIventory();
	public void showFrameShop();
}
	
