package middleearth.characters;

public class Orc extends MiddleEarthCharacter {

	public Orc(String name, double health, double power) {
		super(name, health, power);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean attack(MiddleEarthCharacter target) {
		// TODO Auto-generated method stub
		if(target instanceof Elf || target instanceof Orc) {
			return false;
		}
		
		double damage;
		
		if(target instanceof Human) {
			damage = getPower()*1.5;
		}
		else {
			damage = getPower();
		}
		target.setHealth(getHealth() - damage);
		return true;
	}

	@Override
	public String getRace() {
		// TODO Auto-generated method stub
		return "Orc";
	}

}
