package middleearth.characters;

public class Human extends MiddleEarthCharacter{
	
	public Human(String name, double health, double power) {
		super(name, health, power);
		// TODO Auto-generated constructor stub
	}

	@Override
	boolean attack(MiddleEarthCharacter target) {
		// TODO Auto-generated method stub
		if(target instanceof Orc || target instanceof Human) {
			return false;
		}
		
		double damage;
		
		if(target instanceof Wizard) {
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
		return "Human";
	}
}
