package main;

import middleearth.characters.Dwarf;
import middleearth.characters.Elf;
import middleearth.characters.Human;
import middleearth.characters.Orc;
import middleearth.characters.Wizard;

public class MiddleEarthApp {

	public static void main(String[] args) {
		
		Wizard gandalf = new Wizard("Gandalf The Grey", 100, 500);
		Human aragon = new Human("Aragorn", 100, 250);
		Elf legolas = new Elf("Legolas", 100, 300);
		Orc randomOrc = new Orc("ugly", 200, 50);
		Dwarf bombur = new Dwarf("Bombur", 200, 150);
		
		

	}

}
