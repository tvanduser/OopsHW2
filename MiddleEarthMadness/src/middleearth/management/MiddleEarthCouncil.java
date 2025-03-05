package middleearth.management;

/**
 * The MiddleEarthCouncil class follows the Singleton design pattern and provides access
 * to a single instance of the CharacterManager.
 * It ensures that only one instance of the council exists throughout the application.
 */
public class MiddleEarthCouncil {
    
    //The single instance of the MiddleEarthCouncil 
    private static MiddleEarthCouncil instance;
    
    //The CharacterManager that manages the characters
    private CharacterManager characterManager;

 
    //Private constructor that initializes the CharacterManager instance.
    //This constructor is private to ensure that instances of this class can only be created via the Singleton pattern.
    private MiddleEarthCouncil() {
        characterManager = new CharacterManager();
    }

    /**
     * Retrieves the singleton instance of the MiddleEarthCouncil.
     * If an instance does not exist, it is created.
     * 
     * @return The single instance of MiddleEarthCouncil.
     */
    public static MiddleEarthCouncil getInstance() {
        if (instance == null) {
            instance = new MiddleEarthCouncil();
        }
        return instance;
    }

    /**
     * Returns the CharacterManager associated with this MiddleEarthCouncil.
     * 
     * @return The CharacterManager instance that manages the characters.
     */
    public CharacterManager getCharacterManager() {
        return characterManager;
    }
}
