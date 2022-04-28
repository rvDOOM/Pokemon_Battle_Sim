public abstract class Player {
    protected Pokemon pokemon;
    protected Item item;

    /**
     * Constructor
     * @param pokemon the pokemon object the player will carry
     * @param item the item object the player will carry
     */
    public Player(Pokemon pokemon, Item item) {
        this.pokemon = pokemon;
        this.item = item;
    }

    //getters
    public abstract Pokemon getPokemon();
    public abstract Item getItem();


    /**
     * Run function implemented into each player object
     * should exit program execution at the end
     */
    public abstract void run();

    /**
     * Random action function for computer players
     * If not overwritten and is called by a human player
     * function will simply return
     * @param pokemon takes pokemon object from enemy in the event an attack occurs
     */
    public void randomAction(Pokemon pokemon) {
        return;
    }

}
