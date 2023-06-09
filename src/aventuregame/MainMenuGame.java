package aventuregame;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;

import character.AdapterCharacter;
import character.Character;
import character.IAdapterCharacter;
import character.Warrior;
import mecanich.Mecanich;
import mecanich.TakeClass;
import mob.Mob;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import Inventory.Inventory;
import Inventory.InventoryVer2;
import Story.IStoryControlAdapter;
import Story.IStoryLineAdapter;
import Story.MainStory;
import Story.MeetMobs;
import Story.MeetShop;
import Story.Story;
import Story.StoryControl;
import Story.StoryControlAdaperImp;
import Story.StoryLine;
import Story.StoryLinedAdaperImp;
import Story.StoryType;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenuGame implements IMainMenu {
	JFrame frame;

	public ArrayList<Story> sts ;
	public int index = 0;
	JLabel lblHeal;
	JLabel lblMana;
	JLabel lblAttack;
	JLabel lblAmor;
	JLabel lblLv;
	JTextArea arena;
	JButton btnAttack;
	JLabel lblHealPoint;
	JButton btnNext;
	JButton btnRun;
	JLabel lblExp;
	JButton btnEnterShop;
	JLabel lblAttackPoint;
	JLabel lblAmorPoint;
	JLabel lblManaPoint;
	public static IStoryLineAdapter storyline;
	public static IStoryControlAdapter story;
	public static IAdapterCharacter hero;
	public JLabel lblExpPoint;
	public JLabel lblMaxHealPoint;
	public JLabel lblLvPoint;
	JScrollPane scrollpane;
	private JLabel lbsec;
	
	public void createIStoryLine(IStoryLineAdapter s) {
		this.storyline = s;
	}
	public JLabel getlblLvPoint() {
		return lblLvPoint;
	}
	public JLabel getLblExpPoint() {
		return lblExpPoint;
	}
	public JLabel getLblMaxHealPoint() {
		return lblMaxHealPoint;
	}
	public ArrayList<Story> getStoryline(){
		return this.sts;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public int getIndex() {
		return this.index;
	}

	public static IStoryControlAdapter getStory() {
		return story;
	}
	public static void setStory(IStoryControlAdapter story) {
		MainMenuGame.story = story;
	}
	public IAdapterCharacter getplayer() {
		return getHero();
		
	}
	public static IAdapterCharacter getHero() {
		return hero;
	}
	public void setHero(IAdapterCharacter hero) {
		MainMenuGame.hero = hero;
	}
	public void CreateHero(Character _hero) {
		hero = new AdapterCharacter();
		hero.createHero(_hero);
//		hero.getInventory();
	}
	public void createStory(StoryControl _story) {
		story = new StoryControlAdaperImp();
		story.creatStory(_story);
	}

	public int setHeroHeal() {
		return hero.getHealPoint();
	}
	public int setHeroMaxHeal() {
		return hero.showMaxhealnow();
	}

	public int setHeroMana() {
		return hero.getManaPoint();
	}

	public void setheroGold(int income) {
		hero.setHeroGold(income);
	}
	public int setHeroAtk() {
		return hero.getAttack();
	}

	public int setHeroAmor() {
		return hero.getAmmor();
	}

	public int getplayerlv() {
		return hero.getPlayerLevel();
	}

	public int getplayerExp() {
		return hero.getHeroExp();
	}

	public void heroattack(Mob c , int dame) {
		hero.heroAttack(c , dame);
	}

	public void LvUp() {
		hero.LvUp();
	}

	public boolean checkLvUp() {
		return hero.CheckLvUp();
	}

	public InventoryVer2 takeIven() {
		return hero.getInventory();
	}

	public Character takechar() {
		return hero.getchar();
	}

	public void checklose() {
		if (hero.checkheroisdead()) {
			JOptionPane.showMessageDialog(frame, "Hero đã chết , bạn đã thua!", "Thông Báo",
					JOptionPane.WARNING_MESSAGE);
			frame.setVisible(false);

		}
	}

	public void resetindex() {
		lblHealPoint.setText(String.valueOf(setHeroHeal()));
		lblManaPoint.setText(String.valueOf(setHeroMana()));
		lblAttackPoint.setText(String.valueOf(setHeroAtk()));
		lblMaxHealPoint.setText(String.valueOf(setHeroMaxHeal()));
		lblAmorPoint.setText(String.valueOf(setHeroAmor()));
	}

	public void setStoryLine() {
		this.sts = storyline.getStoryLine();
	}
	public MainMenuGame(Character _hero , IStoryLineAdapter s) {
		createIStoryLine(s);
		setStoryLine();
		CreateHero(_hero);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 557, 485);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				story.controlStory(sts.get(index));
				index++;
			}
		});
		btnNext.setBounds(10, 265, 89, 23);
		frame.getContentPane().add(btnNext);

		btnAttack = new JButton("Attack");
		btnAttack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MeetMobs m = (MeetMobs) sts.get(index - 1);
				Mob mob = m.getMob();
				Character c = hero.getchar();
				story.attackControl(c, mob, index);
				
		}
//				MeetMobs m = (MeetMobs) sts.get(index - 1);
//				Mob mob = m.getMob();
//				Character c = hero.getchar();
//				if (sts.get(index - 1) instanceof MeetMobs) {
//					hero.heroAttack(mob);
//					if(hero.isCrit()) {
//						printContent("Bạn đánh chí mạng được " + hero.getHeroDame(mob));
//					}
//					else {
//						printContent("Bạn đánh được " + hero.getHeroDame(mob));
//					}
//					if (mob.checkalive()) {
//						setheroGold(mob.getGoldDrop());
//						hero.gainExp(mob);
//						printContent(mob.getName() + " Đã chết !!!");
//						printContent(" Bạn nhận được "+ String.valueOf(mob.getExpgain())+" exp");
//						if (hero.CheckLvUp()) {
//							hero.LvUp();
//							printContent("Bạn đã lên cấp !!!");
//							lblExpPoint.setText(String.valueOf(getplayerExp()));
//							lblLvPoint.setText(String.valueOf(getplayerlv()));
//							resetindex();
//						} else {
//							int expgain = Integer.parseInt(lblExpPoint.getText()) + mob.getExpgain();
//							lblExpPoint.setText(String.valueOf(expgain));
//							resetindex();
//						}
//						index++;
//						showMainStory();
//					} else {
//						mob.normalAttack(hero.getchar());
//						if(mob.CrittcalHit()) {
//							printContent("Quái đánh chí mạng được " + mob.getThingsDame(c));
//						}
//						else {
//							printContent("Quái đánh được " + mob.getThingsDame(c));
//						}
//						checklose();
//						resetindex();
//					}
//				}
//			}
		});
		btnAttack.setBounds(10, 299, 89, 23);
		frame.getContentPane().add(btnAttack);

		btnRun = new JButton("Run");
		btnRun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MeetMobs m = (MeetMobs) sts.get(index - 1);
				Mob mob = m.getMob();
				Character c = hero.getchar();
				story.runControl(c, mob, index);
//				m.getMob().normalAttack(hero.getchar(), m.getMob().getDame());
//				checklose();
//				resetindex();
//				index++;
//				showMainStory();
			}
		});
		btnRun.setBounds(112, 299, 89, 23);
		frame.getContentPane().add(btnRun);

		JButton btnBag = new JButton("Open Bag");
		btnBag.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showIventory();
				
			}
		});
		btnBag.setBounds(442, 11, 89, 23);
		frame.getContentPane().add(btnBag);

		btnEnterShop = new JButton("Enter Shop");
		btnEnterShop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showFrameShop();
			}
		});
		btnEnterShop.setBounds(109, 265, 110, 23);
		frame.getContentPane().add(btnEnterShop);

		lblHeal = new JLabel("Heal:");
		lblHeal.setBounds(10, 15, 31, 14);
		frame.getContentPane().add(lblHeal);

		lblMana = new JLabel("Mana:");
		lblMana.setBounds(84, 15, 37, 14);
		frame.getContentPane().add(lblMana);

		lblAttack = new JLabel("Attack:");
		lblAttack.setBounds(147, 15, 44, 14);
		frame.getContentPane().add(lblAttack);

		lblAmor = new JLabel("Amor:");
		lblAmor.setBounds(229, 15, 37, 14);
		frame.getContentPane().add(lblAmor);

		lblLv = new JLabel("Lv:");
		lblLv.setBounds(285, 15, 25, 14);
		frame.getContentPane().add(lblLv);

		lblExp = new JLabel("Exp:");
		lblExp.setBounds(341, 15, 37, 14);
		frame.getContentPane().add(lblExp);

		lblExpPoint = new JLabel(String.valueOf(getplayerExp()));
		lblExpPoint.setBounds(374, 15, 37, 14);
		frame.getContentPane().add(lblExpPoint);

		arena = new JTextArea();
		arena.setEditable(false);
		frame.getContentPane().add(arena);
		arena.setBounds(54, 110, 466, 98);
		scrollpane = new JScrollPane(arena);
		scrollpane.setBounds(10, 45, 521, 209);
		frame.getContentPane().add(scrollpane);

		lblLvPoint = new JLabel(String.valueOf(getplayerlv()));
		lblLvPoint.setBounds(309, 15, 25, 14);
		frame.getContentPane().add(lblLvPoint);

		lblHealPoint = new JLabel(String.valueOf(setHeroHeal()));
		lblHealPoint.setBounds(38, 15, 25, 14);
		frame.getContentPane().add(lblHealPoint);

		lblManaPoint = new JLabel(String.valueOf(setHeroMana()));
		lblManaPoint.setBounds(120, 15, 25, 14);
		frame.getContentPane().add(lblManaPoint);

		lblAttackPoint = new JLabel(String.valueOf(setHeroAtk()));
		lblAttackPoint.setBounds(194, 15, 25, 14);
		frame.getContentPane().add(lblAttackPoint);

		lblAmorPoint = new JLabel(String.valueOf(setHeroAmor()));
		lblAmorPoint.setBounds(263, 15, 15, 14);
		frame.getContentPane().add(lblAmorPoint);

		JButton btnReset = new JButton("ResetCs");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetindex();
			}
		});
		btnReset.setBounds(442, 412, 89, 23);
		frame.getContentPane().add(btnReset);
		
		lblMaxHealPoint = new JLabel(String.valueOf(setHeroMaxHeal()));
		lblMaxHealPoint.setBounds(57, 15, 15, 14);
		frame.getContentPane().add(lblMaxHealPoint);
		
		lbsec = new JLabel("/");
		lbsec.setBounds(51, 15, 4, 14);
		frame.getContentPane().add(lbsec);
		gamestart();
	}

	public void printContent(String content) {
		arena.append("\n" + content);
	}

	public void printNewContent(String content) {
		arena.setText(content);
	}

	public void gamestart() {
		btnAttack.setVisible(false);
		btnRun.setVisible(false);
		btnEnterShop.setVisible(false);
		btnNext.setVisible(true);
	}

	public void showCombat() {
		btnAttack.setVisible(true);
		btnRun.setVisible(true);
		btnEnterShop.setVisible(false);
		btnNext.setVisible(false);
	}

	public void showShop() {
		btnEnterShop.setVisible(true);
		btnAttack.setVisible(false);
		btnRun.setVisible(false);
	}

	public void showMainStory() {
		btnNext.setVisible(true);
		btnAttack.setVisible(false);
		btnRun.setVisible(false);
	}

	public void reset() {

	}
	public void showIventory() {
		InventoryFrame window = new InventoryFrame(hero, this);
		window.frame.setVisible(true);
	}
	public void showFrameShop() {
		MeetShop s = (MeetShop) sts.get(index - 1);
		Shop shop = s.getShop();
		ShopFame window = new ShopFame(shop,hero) ;
		window.frame.setVisible(true);
	}

}
