package mecanich;

import java.util.ArrayList;
import java.util.HashMap;

import Inventory.*;
import Item.Equipment;
import Item.Healing;
import Item.Item;
import ItemData.*;
import Story.MeetMobs;
import Story.MeetShop;
import Story.Story;
import StoryData.*;
import mob.*;

public class TakeClass {

	public static ArrayList<Mob> takemob() {
		ArrayList<Mob> rs = new ArrayList<Mob>();
		rs.add(new IceSpirits());
		rs.add(new Minotaur());
		rs.add(new Orce());
		rs.add(new Rat());
		rs.add(new Scorpion());
		rs.add(new Skeleton());
		rs.add(new Slime());
		rs.add(new Zombie());
		return rs;
	}
	public static ArrayList<Story> TakeStory(){
		ArrayList<Story> rs = new ArrayList<Story>();
		rs.add(new Story1());
		rs.add(new MeetShop());
		for (int i = 0; i < 2; i++) {
			rs.add(new MeetMobs(1));
		}
		rs.add(new Story2());
		for (int i = 0; i < 3; i++) {
			rs.add(new MeetMobs(1));
		}
		rs.add(new Story3());
		for (int i = 0; i < 5; i++) {
			rs.add(new MeetMobs(2));
		}
		rs.add(new Story4());
		rs.add(new MeetShop());
		rs.add(new Story5());
		rs.add(new Story6());
		for (int i = 0; i < 6; i++) {
			rs.add(new MeetMobs(3));
		}
		rs.add(new MeetShop());
		rs.add(new Story7());
		rs.add(new Story8());
		for (int i = 0; i < 6; i++) {
			rs.add(new MeetMobs(8));
		}
		rs.add(new MeetShop());
		rs.add(new Story9());
		for (int i = 0; i < 6; i++) {
			rs.add(new MeetMobs(8));
		}
		rs.add(new MeetShop());
		rs.add(new Story10());
		rs.add(new MeetMobs(new Karma()));
		rs.add(new Story11());
		for (int i = 0; i < 4; i++) {
			rs.add(new MeetMobs(10));
		}
		rs.add(new Story12());
		rs.add(new Story13());
		for (int i = 0; i < 6; i++) {
			rs.add(new MeetMobs(15));
		}
		rs.add(new Story14());
		for (int i = 0; i < 5; i++) {
			rs.add(new MeetMobs(20));
		}
		rs.add(new MeetShop());
		rs.add(new Story15());
		rs.add(new Story16());
		for (int i = 0; i < 5; i++) {
			rs.add(new MeetMobs(20));
		}
		rs.add(new MeetShop());
		rs.add(new Story17());
		rs.add(new MeetMobs(new Reida()));
		rs.add(new Story18());
		rs.add(new MeetMobs(new Karma()));
		for (int i = 0; i < 4; i++) {
			rs.add(new MeetMobs(20));
		}
		rs.add(new Story19());
		rs.add(new MeetMobs(new Darius()));
		rs.add(new Story20());
		return rs;
		
	}
	public static HashMap<Equipment, Integer> takeEquipment() {
		HashMap<Equipment, Integer> shopIven = new HashMap<Equipment, Integer>();
		shopIven.put(new Sword(), 1);
		shopIven.put(new ClothAmor(), 1);
		shopIven.put(new ClothShoes(), 1);
		shopIven.put(new EroticAmor(), 1);
		shopIven.put(new EroticShoes(), 1);
		shopIven.put(new EroticSword(), 1);
		shopIven.put(new Excalibur(), 1);
		shopIven.put(new IronAmor(), 1);
		shopIven.put(new IronShoes(), 1);
		shopIven.put(new IronSword(), 1);
		shopIven.put(new KingAmor(), 1);
		shopIven.put(new LeatherAmor(), 1);
		shopIven.put(new LeatherShoes(), 1);
		shopIven.put(new NamelessSword(), 1);
		shopIven.put(new SilverAmor(), 1);
		shopIven.put(new SilverShoes(), 1);
		shopIven.put(new Stick(), 1);
		shopIven.put(new TitanAmor(), 1);
		shopIven.put(new TitanSword(), 1);
		return shopIven;
	}
	public static Item takeItemByName( String name) {
		ArrayList<Item> listItem = takeAllItem();
		Item rs = null;
		for (Item item : listItem) {
			if(item.getName()==name)
				rs= item;
		}
		return rs;
	}
	public static HashMap<Item , Integer> StarterItem() {
		HashMap<Item, Integer> inven = new HashMap<Item, Integer>();
		inven.put(new Healing(),10);
		inven.put(new Sword(), 1);
		return inven;
	}
	public static ArrayList<Item> takeAllItem(){
		ArrayList<Item> allItem = new ArrayList<>();
		allItem.add(new Healing());
		allItem.add(new Sword());
		allItem.add(new ClothAmor());
		allItem.add(new ClothShoes());
		allItem.add(new EroticAmor());
		allItem.add(new EroticShoes());
		allItem.add(new EroticSword());
		allItem.add(new Excalibur());
		allItem.add(new IronAmor());
		allItem.add(new IronShoes());
		allItem.add(new IronSword());
		allItem.add(new KingAmor());
		allItem.add(new LeatherAmor());
		allItem.add(new LeatherShoes());
		allItem.add(new NamelessSword());
		allItem.add(new SilverAmor());
		allItem.add(new SilverShoes());
		allItem.add(new Stick());
		allItem.add(new TitanSword());
		allItem.add(new TitanAmor());
		return allItem;
		
	}
	public static void main(String[] args) {
		System.out.println((takeItemByName("Small Healing Poition")));
	}
	public static ArrayList<Equipment> StarterEquipment() {
		ArrayList<Equipment> e = new ArrayList<>(3);
		e.add(new Stick());
		e.add(new ClothAmor());
		e.add(new ClothShoes());
		return e;
	}
	public static ArrayList<Item> StarterItemver2() {
		ArrayList<Item> e = new ArrayList<>(3);
		e.add(new Excalibur());
		for (int i = 0; i < 5; i++) {
			e.add(new Healing());
		}
		return e;
	}
}
