
public abstract class Monster {
	private String name;
	abstract  String attack();

	public Monster(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}
		
}

class FireMonster extends Monster{

	public FireMonster(String name) {
		super(name);
	}

	@Override
	public String attack() {
		return getName()+" attacks with Fire";
	}
	
}
class  WaterMonster extends Monster{

	public WaterMonster(String name) {
		super(name);
		
	}

	@Override
	public String attack() {
		return getName()+" attacks with Water";
	}
	
}
class StoneMonster extends Monster{

	public StoneMonster(String name) {
		super(name);
	}

	@Override
	public String attack() {
		return getName()+" attacks with Stones";
	}
	
}

class MonsterTest {
	public static void main(String[] args) {
		Monster firemonster = new FireMonster("Red Eye");
		Monster watermonster = new WaterMonster("Orca");
		Monster rockmonster = new StoneMonster("Glaciator");
		System.out.println(firemonster.attack());
		System.out.println(watermonster.attack());
		System.out.println(rockmonster.attack());
		
	}
}