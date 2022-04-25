public abstract class Player {
    protected Pokemon pokemon;
    protected Item item;

    public Player(Pokemon pokemon, Item item) {
        this.pokemon = pokemon;
        this.item = item;
    }


    public abstract Pokemon getPokemon();

    public abstract Item getItem();

    public abstract void run();

    public void randomAction(Pokemon pokemon) {
        return;
    }

}
