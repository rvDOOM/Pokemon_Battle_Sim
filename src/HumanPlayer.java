public class HumanPlayer extends Player {

    public HumanPlayer(Pokemon pokemon, Item item) {
        super(pokemon, item);
    }

    public Pokemon getPokemon() {
        return super.pokemon;
    }

    public Item getItem() {
        return super.item;
    }

    public void run() {
        System.out.print("HUMAN RUNNING AWAY!");
        System.exit(0);
    }
}

