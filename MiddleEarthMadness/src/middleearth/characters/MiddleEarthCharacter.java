package middleearth.characters;

public abstract class MiddleEarthCharacter {
	
	private String name;
	private double health;
	private double power;
	
	//constructor 
	public MiddleEarthCharacter(String name, double health, double power) {
		this.name = name;
		this.health = health;
		this.power = power;
	}
	
	//----------getters and setters-----------------
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}
	
	//----------abstract methods-------------- 
	abstract boolean attack(MiddleEarthCharacter target);

	//returns the race of a character
	abstract String getRace();
	
	
	//---------concrete methods---------------
	//displays character info 
	void displayInfo() {
		//TODO finish this thing
	}
	
	
}
