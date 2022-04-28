import java.util.ArrayList;

public abstract class Pokemon {
    private String name;
    private int hp;
    private int pp;
    private String type;
    private ArrayList<Attack> attackSet;

    /**
     * Constructor
     * @param name actual name of Pokemon
     * @param hp starting hit points
     * @param pp starting power points
     * @param type a pokemon's type
     * @param attackSet the pokemon's starting attacks
     */
    public Pokemon(String name, int hp, int pp, String type, ArrayList<Attack> attackSet) {
        this.name = name;
        this.hp = hp;
        this.pp = pp;
        this.type = type;
        this.attackSet = attackSet;
    }


    //getters
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public int getHp() {
        return hp;
    }
    public int getPp() {
        return pp;
    }
    public ArrayList<Attack> getAttackSet() { return attackSet; }

    //setters
    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    /**
     * Attack function unique to each pokemon
     * Must take into consideration a pokemones strengths and weaknesses
     * @param enemy the pokemon object that is on the receiving end of damage
     * @param attackIndex position where desired attack lies in the ArrayList attackSet
     */
    public abstract void attack(Pokemon enemy, int attackIndex);

    /**
     * Abstract method
     * Prints out pokemon's "yell"
     */
    public abstract void speak();

    public String toString() {
        return "Pokemon: " + name + "\n" +
                "HP: " + hp + "\n" +
                "PP: " + pp + "\n" +
                "Type: " + type + "\n";
    }
}
