import java.util.ArrayList;

public class Runner {
    private static Pokemon pidgey;
    private static Pokemon pikachu;
    private static Player humanPlayer;
    private static Player computerPlayer;


    /*
     * Populates data for all objects(pokemon, players, items)
     */
    public static void initializeData(){
        //Create attack sets for each Pokemon

        //Pikachu
        ArrayList<Attack> pikachuAttackSet = new ArrayList<Attack>();
        pikachuAttackSet.add(new Attack("Quick Attack", "", 10, "Normal", 10));
        pikachuAttackSet.add(new Attack("Thunder Shock", "", 15, "Electric", 15));
        pikachuAttackSet.add(new Attack("Thunder Wave", "", 5, "Electric", 10));
        pikachuAttackSet.add(new Attack("Thunder Bolt", "", 15, "Electric", 90));
        pikachu = new Pikachu(pikachuAttackSet);


        //Pidgey
        ArrayList<Attack> pidgeyAttackSet = new ArrayList<Attack>();
        pidgeyAttackSet.add(new Attack("Quick Attack", "", 10, "Normal", 20));
        pidgeyAttackSet.add(new Attack("Gust", "", 10, "Flying", 15));
        pidgeyAttackSet.add(new Attack("Feather Dance", "", 15, "Normal", 20));
        pidgey = new Pidgey(pidgeyAttackSet);


        //Instantiate item objects
        Item potion = new Potion();
        Item ether = new Ether();

        //Initialize player objects
        humanPlayer = new HumanPlayer(pikachu, potion);
        computerPlayer =  new ComputerPlayer(pidgey, ether);



    }

    /*
    * Displays human player's and enemy players pokemon's current stats
     */
    public static void battleDisplay(){
        System.out.print("Human Player\n" + humanPlayer.getPokemon());
        System.out.print("\nComputer Player\n\n" + computerPlayer.getPokemon() + "\n");
    }

    public static void main(String[] args) {

        initializeData();
        int min = 0;
        int max = humanPlayer.getPokemon().getAttackSet().size() - 1;
        int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
        try {
            battleDisplay();
            Thread.sleep(3 * 1000);
            System.out.print("Human player's turn\n\n");
            humanPlayer.getPokemon().attack(computerPlayer.getPokemon(), random_int);
            Thread.sleep(3 * 1000);
            battleDisplay();
            System.out.print("Computer player's turn\n\n");
            computerPlayer.randomAction(humanPlayer.getPokemon());
            Thread.sleep(3 * 1000);
            battleDisplay();
            System.out.print("Human player's turn\n\n");
            humanPlayer.getItem().use(humanPlayer.getPokemon());
            Thread.sleep(3 * 1000);
            battleDisplay();
            System.out.print("Computer player's turn\n\n");
            computerPlayer.randomAction(humanPlayer.getPokemon());
            Thread.sleep(3 * 1000);
            battleDisplay();
            humanPlayer.run();
            battleDisplay();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
