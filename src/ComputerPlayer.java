public class ComputerPlayer extends Player {
    //constructor
    public ComputerPlayer(Pokemon pokemon, Item item) {
        super(pokemon, item);
    }

    //getters
    public Pokemon getPokemon() {
        return super.pokemon;
    }
    public Item getItem() {
        return super.item;
    }
    
    public void run() {
        System.out.print("COMPUTER RUNNING AWAY!");
        System.exit(0);
    }

    /**
     * Random action generated with Math.random()
     * Computer player will either attack, use item or run
     * @param enemy takes pokemon object from enemy in the event an attack occurs
     */
    public void randomAction(Pokemon enemy) {
        double i = Math.random();
        if (i >= 0 && i <= .33)      //attack
        {
            int min = 0;
            int max = getPokemon().getAttackSet().size() - 1;
            int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
            getPokemon().attack(enemy, random_int);

        } else if ((i > .33 && i <= .66))        //use item
        {
            getItem().use(getPokemon());
        } else  //run
        {
            run();
        }
    }
}

