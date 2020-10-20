import java.util.Scanner;

import textInterface.textEngine;
//stage
public class textgame {
	
	int choice;
	playerChar PC = new playerChar(10, "Knife", 3);
	monsterChar goblin = new monsterChar("Goblin", 15, 5);

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		textgame game = new textgame();
		game.intro(input);
		game.townGate(input);
		
	}
	
	public void intro(Scanner input) {
		textEngine.printLine();
		textEngine.getName();
		PC.setName(input.nextLine());
		textEngine.printLine();
	}
	
	public void townGate(Scanner input) {
		textEngine.printLine();
		textEngine.townGateGreeting();
		textEngine.townGateChoices();
		textEngine.printLine();
		
		choice = input.nextInt();
		
		if (choice==1) {
			if (PC.hasHead()) {
				textEngine.townGateWin();
				System.exit(0);
			}
			textEngine.townGate1(PC.getName());
			
			if (noChoice(input)==1) {
				townGate(input);
			}
		}
		
		else if (choice==2) {
			textEngine.printLine();
			textEngine.townGate2();
			PC.loseHP(1);
			PC.printHP();
			
			if (PC.getHP()<=0) {
				textEngine.hasDied();
				System.exit(0);
			} else
				townGate(input);
		}
		else if (choice==3) {
			textEngine.townGate3();
			crossRoad(input);
		} else {
			townGate(input);
		}
	}
	
	public void crossRoad(Scanner input) {
		textEngine.printLine();
		textEngine.crossRoadGreet();
		textEngine.crossRoadChoices();
		textEngine.printLine();
		
		choice = input.nextInt();
		
		if (choice==1) {
			north(input);
		}
		else if (choice==2) {
			east(input);
		}
		else if (choice==3) {
			west(input);
		}
		else if (choice==4) {
			townGate(input);
		}
		else {
			crossRoad(input);
		}
	}
	
	public void north(Scanner input) {
		textEngine.printLine();
		textEngine.northGreet();
		PC.healHP(10);
		PC.printHP();
		textEngine.printLine();
		if (noChoice(input)==1) {
			crossRoad(input);
		}
	}
	
	public void east(Scanner input) {
		textEngine.printLine();
		if (PC.getWeapon().equals("Sword")) {
			textEngine.nothingHere();
			if (noChoice(input)==1) {
				crossRoad(input);
			}
		} else {
		textEngine.eastGreet();
		PC.setWeapon("Sword");
		PC.setDMG();
		textEngine.printLine();
		
		if (noChoice(input)==1) {
			crossRoad(input);
		}
		}
	}
	
	public void west(Scanner input) {
		textEngine.printLine();
		
		if (PC.hasHead()==false) {
		textEngine.monsterEncounter(goblin.getName());
	
		choice = input.nextInt();
		
		if (choice==1) {
			fight(input);
		}
		else 
			PC.loseHP(1);
		crossRoad(input);
		textEngine.printLine();
		} else {
			textEngine.nothingHere();
			if (noChoice(input)==1) {
				crossRoad(input);
			}
		}
	}
	
	public void fight(Scanner input) {
		textEngine.printLine();
		textEngine.fightCheck(goblin.getName(), PC.getHP(), goblin.getHP());
		textEngine.printLine();
		
		choice = input.nextInt();
		
		if (choice==1) {
			attack(input);
		}
		else if (choice==2) {
			crossRoad(input);
		}
		else 
			fight(input);
		
	}
	
	public void attack(Scanner input) {
		int attackDMG = PC.getAttackDMG();
		
		textEngine.printLine();
		goblin.loseHP(attackDMG);
		textEngine.attackMonster(PC.getWeapon(), goblin.getHP() );
		
		int monsterDMG = goblin.getAttackDMG();
		if (goblin.getHP()<=0) {
			textEngine.defeatMonster(goblin.getName());
			PC.setHead(true);
			if (noChoice(input)==1) {
				townGate(input);
			}
		}
		else if (goblin.getHP()>0) {
			PC.loseHP(monsterDMG);
			textEngine.attackPlayer(goblin.getName(), PC.getHP());
		}
		
		if (PC.getHP()<=0) {
			textEngine.hasDied();
			System.exit(0);
		}
		textEngine.printLine();
		if (noChoice(input)==1) {
			fight(input);
		}
	}
	
	public int noChoice (Scanner input) {
		textEngine.moveOn();
		choice = input.nextInt();
		if (choice == 1) {
		return 1;
		} else {
			return 1;
		}
	}
}