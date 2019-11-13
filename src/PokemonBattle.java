/* Grading
Sarah Gilliam
Good job!
25/25
*/
/*This is my pseudocode. I think I'm gonna input the scanner. Then I'm 
going to make methods for battlestart, damage, and stats.
for random number use Math.random() but do it like 
lowest number + (Math.random() * (high-low))
*/

import java.util.*;

public class PokemonBattle {
	Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		String name;
		name =battleStart();
		int newhp;
		newhp  =damage(name);
		int level = 0;
		statstable(newhp, name); 
	}
	
	public static String battleStart() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Another trainer is issueing a challenge!");
		System.out.println("Zebtrika appeared.");
		System.out.println("Which Pokemon do you choose?");
		String name = userInput.nextLine();
		System.out.println("You chose " + name);
		System.out.println("It's a Pokemon battle between " + name + " and Zebstrika! Go!");
		return name;
	}

	public static int damage(String name) {
		Scanner userInput = new Scanner(System.in);
		// Change this//
		System.out.println("Zebstrika used Thunderbolt!");
		System.out.println("Trainer, what are your "+name+"'s states?");
		System.out.println("Level: ");
		int level = userInput.nextInt();
		System.out.println("Attack: ");
		int attack = userInput.nextInt();
		System.out.println("Defense: ");
		int defense = userInput.nextInt();
		System.out.println("Base: ");
		int base = userInput.nextInt();
		System.out.println("STAB: ");
		int stab = userInput.nextInt();
		System.out.println("HP: ");
		int hp = userInput.nextInt();
		double modifier = (0.85 + (Math.random() * 0.15) * stab);
		int damagestat = (int) ((((2 * level + 10) / 250) + (attack / defense) * base + 2) * modifier);
		System.out.println(name+" sustained " + damagestat + " points damage.");
		int newhp = hp - damagestat;
		System.out.println("HP, after damage, is now " + newhp);
		return newhp;

	}
	public static void statstable(int newhp, String name) {
		System.out.println("Name    " + name);
		System.out.println("Level    40");
		System.out.println("-----------------------");
		System.out.println("HP      "+newhp);
		System.out.println("ATTACT  52");
		System.out.println("DEFENSE    51");
		System.out.println("SP. ATK   121");
		System.out.println("SP. DEF    81");
		System.out.println("SPEED     107");
		System.out.println("----------------------");
	}
	
}
