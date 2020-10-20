package textInterface;

public class textEngine {
	
	
	public static void printLine() {
		System.out.println("\n********************************************************\n");
	}
	
	public static void getName() {
		System.out.println("After days of tiresome trudging you finally arrive to the town.\nYou check your papers to confirm the wizard wrote your name properly...\n(What is your name?)");
	}
	
	public static void townGateGreeting() {
		System.out.println("You are at the gate of the town.");
		System.out.println("A guard is standing in front of you.");
		System.out.println("What do you do?\n");
	}
	
	public static void townGateChoices() {
		System.out.println("\n1. Talk to the guard");
		System.out.println("2. Attack the guard");
		System.out.println("3. Leave");
	}
	
	public static void townGate1(String name) {
		System.out.printf("Guard: Hello there stranger. So your name is %s.%nSorry but we cannot let a stranger enter our town.%n", name);
	}
	
	public static void moveOn() {
		System.out.println("\n1. Ok.");
	}
	
	public static void townGateWin() {
		System.out.println("You killed the monster? Congratulations, hero\nYou can go into town now.");
		System.out.println("Game over! You Won!");
	}
	
	public static void townGate2() {
		System.out.printf("Hey don't be stupid!%nThe guard hit you so hard you gave up%nYou receive 1 damage.");
	}
	
	public static void townGate3() {
		System.out.println("The guard waves at you as you leave...");
	}
	
	public static void crossRoadGreet() {
		System.out.printf("\nYou are at a crossroads. If you go south, you will go back to the town gate%n");
	}
	
	public static void crossRoadChoices() {
		System.out.println("\n1. Go north");
		System.out.println("2. Go east");
		System.out.println("3. Go west");
		System.out.println("4. Go south");
	}
	
	public static void northGreet() {
		System.out.println("\nThere is a river. You drink the water and rest at the riverside...");
		System.out.println("Your HP is recovered.");
	}
	
	public static void eastGreet() {
		System.out.println("\nYou walked into a forrest and found a long sword");
	}
	
	public static void monsterEncounter(String name) {
		System.out.printf("You encounter a %s!%n", name);
		System.out.println("\n1: Fight");
		System.out.println("2: Run");
	}
	
	public static void fightCheck(String name, int pc_HP, int m_HP) {
		System.out.printf("Your HP: %d%n Monster HP: %d%n", pc_HP, m_HP);
		System.out.println("\n1. Attack");
		System.out.println("2. Run");		
	}
	
	public static void attackMonster(String weapon, int m_HP) {
		System.out.println("You attacked the goblin with your " + weapon);
		//originally print the HP
	}
	
	public static void attackPlayer(String name, int pc_HP) {
		System.out.printf("The %s attacked you!%n", name);
		//originally print the HP
	}
	public static void defeatMonster(String name) {
		System.out.printf("%nYou defeated the %s and ran back to town%n", name);
	}
	
	public static void pressAny() {
		System.out.println("\nPress any number to continue.");
	}
	
	public static void hasDied() {
		System.out.println("You have died!");
		System.out.println("Game over!");
	}
	
	public static void nothingHere() {
		System.out.println("There is nothing here...");
	}
}
