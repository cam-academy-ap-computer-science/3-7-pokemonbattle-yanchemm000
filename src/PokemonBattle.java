	/*This is my pseudocode. I think I'm gonna input the scanner. Then I'm 
	going to make methods for battlestart, damage, and stats.
	for random number use Math.random() but do it like 
	lowest number + (Math.random() * (high-low))
	*/


	import java.util.*;

	public class PokemonBattle {
		Scanner userInput = new Scanner(System.in);
		public static void main(String[] args) {
			
			battleStart();
			damage();
			/*statsTable(); */
		}

		public static void battleStart() {
			Scanner userInput = new Scanner(System.in);
			System.out.println("Another trainer is issueing a challenge!");
			System.out.println("Zebtrika appeared.");
			System.out.println("Which Pokemon do you choose?");
			String name = userInput .nextLine();
			System.out.println("You chose " + name);
			System.out.println("It's a Pokemon battle between " + name + " and Zebstrika! Go!");
		}
		public static void damage() {
			Scanner userInput = new Scanner(System.in);
											//Change this//
			System.out.println("Zebstrika used Thunderbolt!");
			System.out.println("Trainer, what are your ___'s states?");
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
			double damagestat = (int)((((2 * level +10)/250) + (attack/defense) * base + 2) * modifier);
			System.out.println(" _____ sustained " + damagestat + " points damage.");
			double newhp= hp - damagestat;
			System.out.println("this is your new hp " + newhp);
			
			
		}
	}

