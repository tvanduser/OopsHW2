package middleearth.characters;

public class Dwarf extends MiddleEarthCharacter{

	public Dwarf(String name, double health, double power) {
		super(name, health, power);
		// TODO Auto-generated constructor stub
	}

	@Override
	boolean attack(MiddleEarthCharacter target) {
		// TODO Auto-generated method stub
		if(target instanceof Wizard || target instanceof Dwarf) {
			return false;
		}
		
		double damage;
		
		if(target instanceof Elf) {
			damage = getPower()*1.5;
		}
		else {
			damage = getPower();
		}
		target.setHealth(getHealth() - damage);
		return true;
	}

	@Override
	String getRace() {
		// TODO Auto-generated method stub
		return "Dwarf";
	}
	
}
