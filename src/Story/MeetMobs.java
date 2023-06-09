package Story;

import mecanich.MobsFactory;
import mob.Mob;

public class MeetMobs extends Story {
	int playerlevel;
	Mob mob;
	public MeetMobs(int playerLevel) {
		type = StoryType.MEETMOBS;
		mob = createMob(playerLevel);
		storyContent ="Đã phát hiện "+ mob.getName() + " Lv: "+mob.getLv() + " bạn muốn chiến đấu với nó không ?";
	}
	

	public MeetMobs(Mob boss) {
		type = StoryType.MEETMOBS;
		mob = boss;
		storyContent ="Đã phát hiện " + boss.getName() + " Lv: "+boss.getLv() +" bạn muốn chiến đấu với nó không ?";
	}


	public Mob createMob(int playerlevel) {
		return MobsFactory.getMob(playerlevel);
	}

	public Mob getMob() {
		return mob;
	}

	public void setMob(Mob mob) {
		this.mob = mob;
	}
	
}
