import java.util.Scanner;

public class playerChar {
	private int HP;
	private String weapon;
	private int weaponDMG;
	private String playerArmor;
	private String name;
	private boolean hasHead;
	private int loc[] = {0,0};
	
	
	//public void playerSetUp(Scanner input) {
	//	System.out.println("What is your name?");
	//	
	//	playerName = input.nextLine();
	//	
	//	System.out.printf("Your name is: %s%n", playerName);
	//}
	
	public playerChar(int HP, String weapon, int damage) {
		this(HP, weapon, damage, false);
	}
	
	public playerChar(int HP, String weapon, int damage, boolean state) {
		this.HP = HP;
		this.weapon = weapon;
		this.weaponDMG = damage;
		this.hasHead = state;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void printHP() {
		System.out.printf("Your HP: %d%n", this.HP);
	}
	
	public void printWeapon() {
		System.out.printf("Your Weapon: %s%n", this.weapon); //put this in text engine
		System.out.printf("Your damage is: %d%n", weaponDMG);
	}
	
	public void healHP(int num) {
		this.HP+=num;
		if (this.HP>10) {
			this.HP = 10;
		}
	}
	
	public void loseHP(int num) {
		this.HP-=num;
	}
	
	public void setWeapon(String new_weapon) {
		this.weapon = new_weapon;
	}
	
	public void setDMG() {
		if (weapon.equals("Sword")) {
			weaponDMG=10;
		}
		else if (weapon.equals("Knife")) {
			weaponDMG=3;
		}
	}
	
	public void setLoc(int x, int y) {
		this.loc[0] = x;
		this.loc[1] = y;
	}
	
	public int[] getLoc() {
		return this.loc;
	}
	
	public int getX() {
		return this.loc[0];
	}
	
	public int getY() {
		return this.loc[1];
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getHP() {
		return HP;
	}
	
	public String getWeapon() {
		return this.weapon;
	}
	public boolean hasHead() {
		return this.hasHead;
	}
	
	public void setHead(boolean state) {
		this.hasHead = state;
	}
	
	//roll combat damage
	public int getAttackDMG() {
		return new java.util.Random().nextInt(weaponDMG);
	}
}
	
