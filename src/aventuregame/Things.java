package aventuregame;

import java.util.ArrayList;
import java.util.List;

import mecanich.Mecanich;
import skill.Skill;

public abstract class Things implements combat {
	public boolean alive = true;
	public List<Skill> listSkill = new ArrayList<Skill>();
	public String name;
	public int maxheal;
	public int healPoint;
	public int dame;
	public int armor;
	public int lv;

	
	public List<Skill> getList() {
		return listSkill;
	}

	public void setList(List<Skill> list) {
		this.listSkill = list;
	}

	public void learnSkill(Skill s) {
		listSkill.add(s);
	}
	public int getDame() {
		return dame;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public int getMaxheal() {
		return maxheal;
	}

	public void setMaxheal(int maxheal) {
		this.maxheal = maxheal;
	}

	public void setDame(int dame) {
		this.dame = dame;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealPoint() {
		return healPoint;
	}

	public void setHealPoint(int healPoint) {
		this.healPoint = healPoint;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	@Override
	public abstract void normalAttack(Things c,int dame) ;


	public boolean checkalive() {
		if (this.getHealPoint() <= 0) {
			System.out.println(this.name+" Da chet !");
			return true;
		}
		return false;
	}

}
