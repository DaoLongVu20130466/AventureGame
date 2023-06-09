package mecanich;

import java.util.ArrayList;
import java.util.Random;

import mob.*;
import mob.Mob;

public class MobsFactory {
	static ArrayList<Mob> mob = TakeClass.takemob();

	public static Mob getMob(int MobLv) {
		ArrayList<Mob> shortlist = new ArrayList<Mob>();
		for (Mob mob : mob) {
			if (mob.lv <= MobLv + 5 && mob.lv >= MobLv - 5){
				shortlist.add(mob);
			}
		}
		return randommob(shortlist);
	}
	public static Mob randommob(ArrayList<Mob> arr) {
		Random rand = new Random();
		int num = arr.size();
		int ranNum = rand.nextInt(num);
		return arr.get(ranNum);
	}

}
