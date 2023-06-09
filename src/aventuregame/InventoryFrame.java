package aventuregame;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;

import Item.Equipment;
import Item.Healing;
import Item.Item;
import character.AdapterCharacter;
import character.Character;
import character.IAdapterCharacter;
import character.Warrior;
import mecanich.TakeClass;

import java.awt.Component;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InventoryFrame {

	JFrame frame;
	static IAdapterCharacter hero; //= new AdapterCharacter();
	JTable equipmentTable ;
	JTable itemTable;
	DefaultTableModel equipmentmodel;
	DefaultTableModel Itemtmodel;
	ArrayList<Equipment> equipment; //=hero.takeIventory() ;
	ArrayList<Item> item;// = hero.takeItem();
	MainMenuGame mainMenu;

	public void heroUseItem(String s) {
		Item rs = TakeClass.takeItemByName(s);
		hero.useItem(rs);
	}
	public int getgold() {
		return hero.getHeroGold();
	}
	

	public InventoryFrame(IAdapterCharacter hero2 , MainMenuGame mainMenu) {
//		hero = new AdapterCharacter();
		this.mainMenu = mainMenu;
		equipment = hero2.takeIventory();
		item= hero2.takeItem();
		hero = hero2;
		initialize();
		equipmentmodel = (DefaultTableModel) equipmentTable.getModel();
		Itemtmodel = (DefaultTableModel) itemTable.getModel();
		showEquipment();
		showItem();
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 335, 553);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		equipmentTable = new JTable();
		equipmentTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Quaility", "Value"
			}
		));
		itemTable = new JTable();
		itemTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Value"
			}
		));
		JScrollPane scrollPane = new JScrollPane(equipmentTable);
		scrollPane.setBounds(10, 36, 299, 132);
		frame.getContentPane().add(scrollPane);
		
		JLabel lblEquipment = new JLabel("Equipment");
		lblEquipment.setBounds(10, 11, 70, 14);
		frame.getContentPane().add(lblEquipment);
		
		JLabel lblItemLb = new JLabel("Item");
		lblItemLb.setBounds(10, 179, 46, 14);
		frame.getContentPane().add(lblItemLb);
		
		JScrollPane scrollPane_1 = new JScrollPane(itemTable);
		scrollPane_1.setBounds(10, 204, 299, 258);
		frame.getContentPane().add(scrollPane_1);
		
		JButton btnUseBtn = new JButton("Use");
		btnUseBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
 				int row = itemTable.getSelectedRow();
 				if(row <= -1) {
 					JOptionPane.showMessageDialog(frame, "Bạn chưa chọn gì mà", "Thông Báo",
 							JOptionPane.WARNING_MESSAGE);
 				}
 				else {
				String ids = (String) itemTable.getValueAt(row, 0);
				heroUseItem(ids);
				showEquipment();
				showItem();
				mainMenu.resetindex();
 				}
				frame.setVisible(false);
			}
		});
		btnUseBtn.setBounds(220, 480, 89, 23);
		frame.getContentPane().add(btnUseBtn);
		
		JLabel lblGold = new JLabel("Gold :");
		lblGold.setBounds(193, 11, 35, 14);
		frame.getContentPane().add(lblGold);
		
		JLabel lblGoldIfor = new JLabel(String.valueOf(getgold()));
		lblGoldIfor.setBounds(226, 11, 46, 14);
		frame.getContentPane().add(lblGoldIfor);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnBack.setBounds(10, 480, 89, 23);
		frame.getContentPane().add(btnBack);
	}

	public void showEquipment() {
		equipmentmodel.getDataVector().removeAllElements();
		for (Equipment equipment2 : equipment) {
			equipmentmodel
					.addRow(new Object[] { equipment2.getName(), equipment2.getRaility(), equipment2.getValue() });
		}
	}

	public void showItem() {
		Itemtmodel.getDataVector().removeAllElements();
		for (Item item : item) {
			Itemtmodel
					.addRow(new Object[] { item.getName(), item.getValue() });
		}
	}
}
