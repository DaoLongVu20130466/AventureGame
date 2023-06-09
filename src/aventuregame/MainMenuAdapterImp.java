package aventuregame;

import java.util.ArrayList;

import javax.swing.JLabel;

import Inventory.InventoryVer2;
import Story.Story;
import Story.StoryControl;
import character.Character;
import character.IAdapterCharacter;
import mob.Mob;

public class MainMenuAdapterImp implements IMainMenuAdapter {

	IMainMenu i ;

	@Override
	public int setHeroHeal() {
		return i.setHeroHeal();
	}

	@Override
	public int setHeroMaxHeal() {
		return 0;
	}

	@Override
	public int setHeroMana() {
		return i.setHeroMana();
	}

	@Override
	public void setheroGold(int income) {
		i.setheroGold(income);
	}

	@Override
	public int setHeroAtk() {
		return i.setHeroAtk();
	}

	@Override
	public int setHeroAmor() {
		return i.setHeroAmor();
	}

	@Override
	public int getplayerlv() {
		return i.getplayerlv();
	}

	@Override
	public int getplayerExp() {
		return i.getplayerExp();
	}

	@Override
	public void heroattack(Mob c, int dame) {
		i.heroattack(c, dame);
		
	}

	@Override
	public void LvUp() {
		i.LvUp();
		
	}

	@Override
	public boolean checkLvUp() {
		return i.checkLvUp();
	}

	@Override
	public InventoryVer2 takeIven() {
		return i.takeIven();
	}

	@Override
	public Character takechar() {
		return i.takechar();
	}

	@Override
	public void checklose() {
		i.checklose();
		
	}

	@Override
	public void resetindex() {
		i.resetindex();
		
	}

	@Override
	public void printContent(String content) {
		i.printContent(content);
		
	}

	@Override
	public void printNewContent(String content) {
		i.printNewContent(content);
		
	}

	@Override
	public void gamestart() {
		i.gamestart();
		
	}

	@Override
	public void showCombat() {
		i.showCombat();
		
	}

	@Override
	public void showShop() {
		i.showShop();
		
	}

	@Override
	public void showMainStory() {
		i.showMainStory();
		
	}

	@Override
	public void showIventory() {
		i.showIventory();
		
	}

	@Override
	public void showFrameShop() {
		i.showFrameShop();
		
	}

	@Override
	public void setMainMenu(MainMenuGame m) {
		this.i = m;
		
	}

	@Override
	public int getIndex() {
		return i.getIndex();
	}

	@Override
	public void setIndex(int Index) {
		i.setIndex(Index);
	}

	@Override
	public IAdapterCharacter getplayer() {
		return i.getplayer();
	}

	@Override
	public ArrayList<Story> getStoryline() {
		return i.getStoryline();
	}

	@Override
	public JLabel getlblLvPoint() {
		return i.getlblLvPoint();
	}

	@Override
	public JLabel getLblExpPoint() {
		return i.getLblExpPoint();
	}

	@Override
	public JLabel getLblMaxHealPoint() {
		return i.getLblMaxHealPoint();
	}

}
