package main;

import java.util.Objects;

import middleearth.characters.Dwarf;
import middleearth.characters.Elf;
import middleearth.characters.Human;
import middleearth.characters.MiddleEarthCharacter;
import middleearth.characters.Orc;
import middleearth.characters.Wizard;

import middleearth.management.CharacterManager;
import middleearth.management.MiddleEarthCouncil;

public class MiddleEarthApp {

	public static void main(String[] args) {
		
		CharacterManager lotr = new CharacterManager(); //initializing a new management system
		//creating the characters to be added to the manager 
		Wizard gandalf = new Wizard("Gandalf The Grey", 100, 500);
		Human aragon = new Human("Aragorn", 100, 250);
		Elf legolas = new Elf("Legolas", 100, 300);
		Orc randomOrc = new Orc("Ugly", 200, 50);
		Dwarf bombur = new Dwarf("Bombur", 200, 150);
		
		//adding characters to the character manager
		lotr.addCharacter(gandalf);
		lotr.addCharacter(randomOrc);
		lotr.addCharacter(bombur);
		lotr.addCharacter(legolas);
		lotr.addCharacter(aragon);
		
		//testing display all characters
		lotr.displayAllCharacters();
		
		//testing updating of a character, trying to switch Gandalf's power to 1000.0
		System.out.println(lotr.updateCharacter(gandalf, "Gandalf", 100, 1000)); //seeing if it prints true/false
		System.out.println(lotr.updateCharacter(gandalf, "Gandalf", 100, 1000)); //^^^^^
		lotr.displayAllCharacters();
		
		//testing delete a character
		lotr.deleteCharacter(randomOrc);
		System.out.println("\nUpdated Array of Characters");
		lotr.displayAllCharacters();
		
		//attacking testing, have everyone attack everyone 
		for(MiddleEarthCharacter attacker : lotr.characters) {
			for(MiddleEarthCharacter target : lotr.characters) {
				if(attacker != null && target != null) {
					if(attacker.attack(target)) {
						System.out.println("\nSuccess: " + attacker.getName() + " attacked " + target.getName());
					}
					else {
						System.out.println("\nFail: " + attacker.getRace() + " is innefective against " + target.getRace());
					}
				}
				
			}
		}


		
		

	}

}
