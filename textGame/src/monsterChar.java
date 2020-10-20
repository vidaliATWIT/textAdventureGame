
public class monsterChar {
	private int HP;
	private int DMG;
	private String armor;
	private String name;
	
	public monsterChar(String name, int HP, int damage) {
		this.name = name;
		this.HP = HP;
		this.DMG = damage;
	}
	
	public void printHP () {
		System.out.printf("%s HP: %d%n", this.name, this.HP);
	}
	
	public void healHP(int num) {
		this.HP+=num;	
	}
	
	public void loseHP(int num) {
		this.HP-=num;
	}
	
	public int getAttackDMG() {
		return new java.util.Random().nextInt(DMG);
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getHP() {
		return this.HP;
	}
	

}
