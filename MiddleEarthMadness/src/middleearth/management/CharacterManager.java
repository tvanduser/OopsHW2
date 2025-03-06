package middleearth.management;

import middleearth.characters.MiddleEarthCharacter;

/**
 * The CharacterManager class manages the MiddleEarthCharacter objects.
 * It allows for adding, updating, deleting, and retrieving characters.
 * It also supports dynamically resizing the array of characters when its gets full.
 */
public class CharacterManager {
    //-------Fields------\\
    public MiddleEarthCharacter[] characters; // Array to store characters
    public int size; // The number of characters currently in the array
    
    //------Methods------\\
    
    //Constructs a new CharacterManager with the initial array size
    public CharacterManager() {
        this.characters = new MiddleEarthCharacter[20]; ///starting with 20
        this.size = 0;
    }

    /**
     * Adds a new character to the array.
     * if array is full calls resizeArray(); 
     * 
     * @param c The character to add.
     * @return true if the character was added successfully, otherwise false.
     */
    public boolean addCharacter(MiddleEarthCharacter c) {
        if (size == characters.length) {
            resizeArray();
        }
        
		characters[size] = c; 
		size++;
		
		
		
        return true;
    }

    /**
     * Retrieves a character by name.
     * 
     * @param name The name of the character to retrieve.
     * @return The MiddleEarthCharacter with the given name, or null if no such character exists.
     */
    public MiddleEarthCharacter getCharacter(String name) {
        for (int i = 0; i < size; i++) {
            if (characters[i].getName().equalsIgnoreCase(name)) {
                return characters[i];
            }
        }
        return null;
    }


    //Resizes the character array to double its current size.
    private void resizeArray() {
        MiddleEarthCharacter[] newArray = new MiddleEarthCharacter[characters.length * 2];
        System.arraycopy(characters, 0, newArray, 0, characters.length);
        characters = newArray;
    }

    /**
     * Updates the character's name, health, and power if they differ from the current values.
     * 
     * @param character The character to update.
     * @param name The new name for the character.
     * @param health The new health value for the character.
     * @param power The new power value for the character.
     * @return true if any of the character's details were updated, otherwise false.
     */
    public boolean updateCharacter(MiddleEarthCharacter character, String name, int health, int power) {
        if (character.equals(null)) { 
            System.err.println("Character does not exist");
            return false;
        }

        boolean updated = false;

        // Checking if value is different than current value in character.
        // If different, update and return true.
        if (!character.getName().equals(name)) {
            character.setName(name);
            updated = true;
        }

        if (character.getHealth() != health) {
            character.setHealth(health);
            updated = true;
        }
        if (character.getPower() != power) {
            character.setPower(power);
            updated = true;
        }

        return updated;
    }

    /**
     * Deletes a character from the array.
     * 
     * @param character The character to delete.
     * @return true if the character was successfully deleted, otherwise false.
     */
    public boolean deleteCharacter(MiddleEarthCharacter character) { //TODO I want to make this easier...
        if (character.equals(null)) {
            System.err.println("Character does not exist");
            return false;
        }

        for (int i = 0; i < size; i++) {
            if (characters[i].equals(character)) {
            	if(characters[i].equals(size - 1)){//checking if we're deleting the last element 
            		characters[i] = null; 
            	}else{ 
            		characters[i] = characters[size - 1]; 
            		characters[size - 1] = null;
                	size--;
            	}
                return true;
            }
        }
        return false;
    }


    public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	

	public MiddleEarthCharacter[] getCharacters() {
		return characters;
	}

	public void setCharacters(MiddleEarthCharacter[] characters) {
		this.characters = characters;
	}

	//Displays the information of all characters currently in the manager.
    public void displayAllCharacters() {
        for (int i = 0; i < size; i++) {
            characters[i].displayInfo();
        }
    }
}
