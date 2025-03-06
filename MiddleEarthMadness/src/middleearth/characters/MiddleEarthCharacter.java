package middleearth.characters;

public abstract class MiddleEarthCharacter {
	
	//branch example
	
	private String name;
	private double health;
	private double power;
	
	//constructor 
	/**
	 * constructor when you make a new character to set its attributes 
	 * @param name of character
	 * @param health of character
	 * @param power of character
	 */
	public MiddleEarthCharacter(String name, double health, double power) {
		this.name = name;
		this.health = health;
		this.power = power;
	}
	
	//----------getters and setters-----------------
	/**
	 * returns the name of a character
	 * @return name of character
	 */
	public String getName() {
		return name;
	}

	/**
	 * sets the name of a middle earth character
	 * @param name set the name of the character
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * gets the health of a character
	 * @return health of character
	 */
	public double getHealth() {
		return health;
	}

	/**
	 * sets the health of a character
	 * @param health of character
	 */
	public void setHealth(double health) {
		this.health = health;
	}

	/**
	 * gets the power of a character
	 * @return the power of a character
	 */
	public double getPower() {
		return power;
	}

	/**
	 * sets the power of a character
	 * @param power of character
	 */
	public void setPower(double power) {
		this.power = power;
	}
	
	//----------abstract methods-------------- 
	/**
	 * abstract function that acts differently depending on what character type is attacking 
	 * @param target the character being attacked 
	 * @return true on success false on fail 
	 */
	public abstract boolean attack(MiddleEarthCharacter target);

	//returns the race of a character
	/**
	 * abstract method to return the race of a character
	 * @return race of character 
	 */
	public abstract String getRace();
	
	
	//---------concrete methods---------------
	//displays character info 
	/**
	 * displays the name, health, and power of a character
	 */
	public void displayInfo() {
		System.out.println("Name: " + this.getName() + ", Health: " + this.getHealth() + ", Power: " + this.getPower());
	}
	
	
}
