package aventuregame;

import java.awt.EventQueue;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Item.Item;
import character.AdapterCharacter;
import character.Character;
import character.IAdapterCharacter;
import character.Warrior;
import mecanich.TakeClass;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ShopFame {

	JFrame frame;
	static IAdapterCharacter hero;
	JTable itemTable;
	BufferedImage shopkeeper;
	DefaultTableModel Itemtmodel;
	IAdapterShop ishop;
	ArrayList<Item> item;
	JLabel lblGoldInfor;

	public void CreateShop(Shop _shop) {
		ishop = new AdapterShop();
		ishop.createShop(_shop);
	}
	public void heroBuyItem(String s) {
		Item rs = TakeClass.takeItemByName(s);
		if(rs.getValue() > hero.getHeroGold()) {
			JOptionPane.showMessageDialog(frame, "Bạn không có đủ tiền", "Thông Báo",
					JOptionPane.WARNING_MESSAGE);
		}
		else {
			hero.setgold(rs.getValue());
			hero.herobyItem(rs);
			JOptionPane.showMessageDialog(frame, "Đã mua thành công !!", "Thông Báo",
					JOptionPane.WARNING_MESSAGE);
		}
	}
	public ShopFame( Shop _shop , IAdapterCharacter hero2) {
		hero = hero2;
		CreateShop(_shop);
		try {
			shopkeeper = ImageIO.read(new File("./src/Image/Shopkeeper.jpg"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		initialize();
		Itemtmodel = (DefaultTableModel) itemTable.getModel();
		showItem();
		}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 381, 561);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JButton btnBuy = new JButton("Buy");
		btnBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row = itemTable.getSelectedRow();
				if(row <= -1) {
 					JOptionPane.showMessageDialog(frame, "Bạn chưa chọn gì mà", "Thông Báo",
 							JOptionPane.WARNING_MESSAGE);
 				}else {
				String ids = (String) itemTable.getValueAt(row, 0);
				heroBuyItem(ids);
				lblGoldInfor.setText(String.valueOf(hero.getHeroGold()));
				}
			}
		});
		btnBuy.setBounds(266, 488, 89, 23);
		frame.getContentPane().add(btnBuy);
		
		JTextPane txtpnXinChoNgi = new JTextPane();
		txtpnXinChoNgi.setEditable(false);
		txtpnXinChoNgi.setText("Xin ch\u00E0o ng\u01B0\u1EDDi l\u1EEF h\u00E0nh, tr\u00F4ng c\u1EADu c\u00F3 v\u1EBB m\u1EC7t \u0111\u1EA5y , c\u00F3 mu\u1ED1n gh\u00E9 qua m\u1ED9t \u00EDt \u0111\u1ED3 h\u1ED3i ph\u1EE5c kh\u00F4ng ?");
		txtpnXinChoNgi.setBounds(132, 11, 223, 87);
//		txtpnXinChoNgi.setText(txtpnXinChoNgi .getText() +"\n" + "newtext o day nay ban oi");
//		txtpnXinChoNgi.
		frame.getContentPane().add(txtpnXinChoNgi);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon(shopkeeper));
		lblNewLabel.setBounds(10, 11, 112, 87);
		frame.getContentPane().add(lblNewLabel);
		itemTable = new JTable();
		itemTable.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Name", "Value" , "Type"
				}
			));
		JScrollPane scrollPane = new JScrollPane(itemTable);
		scrollPane.setBounds(10, 109, 345, 368);
		frame.getContentPane().add(scrollPane);
		
		JLabel lblHeroGold = new JLabel("Gold");
		lblHeroGold.setBounds(10, 492, 33, 14);
		frame.getContentPane().add(lblHeroGold);
		
		lblGoldInfor = new JLabel(String.valueOf(hero.getHeroGold()));
		lblGoldInfor.setBounds(53, 492, 46, 14);
		frame.getContentPane().add(lblGoldInfor);

	}
	public void showItem() {
		item = ishop.getItem();
		for (Item item2 : item) {
			Itemtmodel
			.addRow(new Object[] { item2.getName(), item2.getValue(), item2.getType()});
		}
	}

}
